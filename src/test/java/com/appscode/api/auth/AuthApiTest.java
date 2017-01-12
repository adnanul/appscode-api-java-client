package com.appscode.api.auth;

import com.appscode.api.dtypes.VoidRequest;
import com.appscode.api.health.HealthGrpc;
import com.appscode.api.health.StatusResponse;
import com.appscode.api.kubernetes.v1beta2.ClientsGrpc;
import com.appscode.api.kubernetes.v1beta2.ListResourceRequest;
import com.appscode.api.kubernetes.v1beta2.ListResourceResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.auth.MoreCallCredentials;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthApiTest {
  private ManagedChannel channel;
  private String hostname = "localhost";
  private int port = 9877;

  @Before
  public void setUp() throws Exception {
    channel = ManagedChannelBuilder.forAddress(hostname, port)
        .usePlaintext(true)
        .build();
  }

  @After
  public void tearDown() throws Exception {
    channel.shutdown();
  }

  @Test
  public void testWithPasswordCredentialAPI() {
    ClientsGrpc.ClientsBlockingStub blockingStub = ClientsGrpc.newBlockingStub(channel).
        withCallCredentials(
            MoreCallCredentials.from(new PasswordCredential("devapp", "user", "password")));
    ListResourceRequest request = ListResourceRequest.newBuilder().setCluster("h-505")
        .setType("pods").build();
    ListResourceResponse response = blockingStub.list(request);

    assertEquals(response.getStatus().getStatus(), "OK");
    assertEquals(response.getStatus().getCode(), "0");
  }

  @Test
  public void testWithTokenCredentialAPI() {
    ClientsGrpc.ClientsBlockingStub blockingStub = ClientsGrpc.newBlockingStub(channel).
        withCallCredentials(
            MoreCallCredentials
                .from(new TokenCredential("devapp", "api-token")));
    ListResourceRequest request = ListResourceRequest.newBuilder().setCluster("h-505")
        .setType("pods").build();
    ListResourceResponse response = blockingStub.list(request);

    assertEquals(response.getStatus().getStatus(), "OK");
    assertEquals(response.getStatus().getCode(), "0");
  }

  @Test
  public void testForUnAuthenticatedAPI() {
    HealthGrpc.HealthBlockingStub blockingStub = HealthGrpc.newBlockingStub(channel);
    VoidRequest request = VoidRequest.newBuilder().build();

    StatusResponse response = blockingStub.status(request);
    assertEquals(response.getStatus().getStatus(), "OK");
    assertEquals(response.getStatus().getCode(), "0");
  }
}
