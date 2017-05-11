package com.appscode.api.auth;

import static org.junit.Assert.assertNotNull;

import com.appscode.api.dtypes.VoidRequest;
import com.appscode.api.health.HealthGrpc;
import com.appscode.api.health.StatusResponse;
import com.appscode.api.kubernetes.v1beta2.ClientsGrpc;
import com.appscode.api.kubernetes.v1beta2.ListResourceRequest;
import com.appscode.api.kubernetes.v1beta2.ListResourceResponse;
import io.grpc.ManagedChannel;
import io.grpc.auth.MoreCallCredentials;
import io.grpc.internal.DnsNameResolverProvider;
import io.grpc.netty.NettyChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AuthApiTest {

  private ManagedChannel channel;
  private String hostname = "localhost";
  private int port = 50077;

  @Before
  public void setUp() throws Exception {
    channel = NettyChannelBuilder.forAddress(hostname, port)
        .nameResolverFactory(new DnsNameResolverProvider())
        .usePlaintext(true)
        .build();
  }

  @After
  public void tearDown() throws Exception {
    channel.shutdown();
  }

  @Ignore
  @Test
  public void testWithPasswordCredentialAPI() {
    ClientsGrpc.ClientsBlockingStub blockingStub = ClientsGrpc.newBlockingStub(channel).
        withCallCredentials(
            MoreCallCredentials.from(new PasswordCredential("devapp", "user", "password")));
    ListResourceRequest request = ListResourceRequest.newBuilder()
        .setCluster("h-505")
        .setType("pods")
        .build();
    ListResourceResponse response = blockingStub.list(request);
    assertNotNull(response);
  }

  @Ignore
  @Test
  public void testWithTokenCredentialAPI() {
    ClientsGrpc.ClientsBlockingStub blockingStub = ClientsGrpc.newBlockingStub(channel).
        withCallCredentials(
            MoreCallCredentials
                .from(new TokenCredential("devapp", "api-token")));
    ListResourceRequest request = ListResourceRequest.newBuilder()
        .setCluster("h-505")
        .setType("pods")
        .build();
    ListResourceResponse response = blockingStub.list(request);
    assertNotNull(response);
  }

  @Ignore
  @Test
  public void testForUnAuthenticatedAPI() {
    HealthGrpc.HealthBlockingStub blockingStub = HealthGrpc.newBlockingStub(channel);
    VoidRequest request = VoidRequest.newBuilder().build();

    StatusResponse response = blockingStub.status(request);
    assertNotNull(response);
  }
}
