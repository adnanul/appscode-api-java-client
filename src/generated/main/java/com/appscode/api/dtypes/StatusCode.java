// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appscode/api/dtypes/types.proto

package com.appscode.api.dtypes;

/**
 * <pre>
 * Next Id = 20
 * </pre>
 *
 * Protobuf enum {@code appscode.dtypes.StatusCode}
 */
public enum StatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not an error. Returned on success.
   * Similar to HTTP Status code 2**.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <pre>
   * Request Unsucesful
   * </pre>
   *
   * <code>FAILED = 1;</code>
   */
  FAILED(1),
  /**
   * <pre>
   * The request does not have valid authentication credentials for the
   * operation. Similar to HTTP status code 401.
   * </pre>
   *
   * <code>UNAUTHORIZED = 2;</code>
   */
  UNAUTHORIZED(2),
  /**
   * <pre>
   * The request contains invalid arguments.
   * Similar to HTTP status code 400
   * </pre>
   *
   * <code>BADREQUEST = 3;</code>
   */
  BADREQUEST(3),
  /**
   * <pre>
   * The caller does not have permission to execute the specified
   * operation. Reserved For further use.
   * Similar to HTTP Status code 403
   * </pre>
   *
   * <code>PERMISSION_DENIED = 4;</code>
   */
  PERMISSION_DENIED(4),
  /**
   * <pre>
   * Requested entity not found.
   * Similar to HTTP status code 404
   * </pre>
   *
   * <code>NOT_FOUND = 5;</code>
   */
  NOT_FOUND(5),
  /**
   * <pre>
   * The operation is not implemented or is not supported/enabled
   * Similar to HTTP status code 501
   * </pre>
   *
   * <code>UNIMPLEMENTED = 6;</code>
   */
  UNIMPLEMENTED(6),
  /**
   * <pre>
   * Internal errors. This means that some invariants expected by the
   * underlying system have been broken.
   * Similar to HTTP status code 500
   * </pre>
   *
   * <code>INTERNAL = 7;</code>
   */
  INTERNAL(7),
  /**
   * <pre>
   * External Server Refuses Connection or Sends Invalid Data.
   * </pre>
   *
   * <code>EXTERNAL = 8;</code>
   */
  EXTERNAL(8),
  /**
   * <pre>
   * The response contains invalid arguments.
   * </pre>
   *
   * <code>BAD_RESPONSE = 9;</code>
   */
  BAD_RESPONSE(9),
  /**
   * <pre>
   * Unknown error.
   * Errors raised by APIs that do not return enough error information
   * may be converted to this error.
   * Similar to HTTP status code 500
   * </pre>
   *
   * <code>UNKNOWN_ERROR = 10;</code>
   */
  UNKNOWN_ERROR(10),
  /**
   * <pre>
   * Quota and payment related error codes.
   * client request crossses the exisitng quta limits.
   * </pre>
   *
   * <code>QUOTA_LIMIT_EXCEED = 11;</code>
   */
  QUOTA_LIMIT_EXCEED(11),
  /**
   * <pre>
   * no valid quta available
   * </pre>
   *
   * <code>INVALID_QUOTA = 12;</code>
   */
  INVALID_QUOTA(12),
  /**
   * <pre>
   * no payment informtaion avaible
   * </pre>
   *
   * <code>PAYMENT_INFORMATION_UNAVAILABLE = 13;</code>
   */
  PAYMENT_INFORMATION_UNAVAILABLE(13),
  /**
   * <pre>
   * payment information not valid.
   * </pre>
   *
   * <code>INVALID_PAYMENT_INFORMATION = 14;</code>
   */
  INVALID_PAYMENT_INFORMATION(14),
  /**
   * <pre>
   * failed to transect the payment information
   * </pre>
   *
   * <code>TRANSACTION_FAILED = 15;</code>
   */
  TRANSACTION_FAILED(15),
  /**
   * <pre>
   * to give ARE_YOU_SURE option
   * </pre>
   *
   * <code>ARE_YOU_SURE = 16;</code>
   */
  ARE_YOU_SURE(16),
  /**
   * <pre>
   *invalid data
   * </pre>
   *
   * <code>INVALID_DATA = 17;</code>
   */
  INVALID_DATA(17),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not an error. Returned on success.
   * Similar to HTTP Status code 2**.
   * </pre>
   *
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <pre>
   * Request Unsucesful
   * </pre>
   *
   * <code>FAILED = 1;</code>
   */
  public static final int FAILED_VALUE = 1;
  /**
   * <pre>
   * The request does not have valid authentication credentials for the
   * operation. Similar to HTTP status code 401.
   * </pre>
   *
   * <code>UNAUTHORIZED = 2;</code>
   */
  public static final int UNAUTHORIZED_VALUE = 2;
  /**
   * <pre>
   * The request contains invalid arguments.
   * Similar to HTTP status code 400
   * </pre>
   *
   * <code>BADREQUEST = 3;</code>
   */
  public static final int BADREQUEST_VALUE = 3;
  /**
   * <pre>
   * The caller does not have permission to execute the specified
   * operation. Reserved For further use.
   * Similar to HTTP Status code 403
   * </pre>
   *
   * <code>PERMISSION_DENIED = 4;</code>
   */
  public static final int PERMISSION_DENIED_VALUE = 4;
  /**
   * <pre>
   * Requested entity not found.
   * Similar to HTTP status code 404
   * </pre>
   *
   * <code>NOT_FOUND = 5;</code>
   */
  public static final int NOT_FOUND_VALUE = 5;
  /**
   * <pre>
   * The operation is not implemented or is not supported/enabled
   * Similar to HTTP status code 501
   * </pre>
   *
   * <code>UNIMPLEMENTED = 6;</code>
   */
  public static final int UNIMPLEMENTED_VALUE = 6;
  /**
   * <pre>
   * Internal errors. This means that some invariants expected by the
   * underlying system have been broken.
   * Similar to HTTP status code 500
   * </pre>
   *
   * <code>INTERNAL = 7;</code>
   */
  public static final int INTERNAL_VALUE = 7;
  /**
   * <pre>
   * External Server Refuses Connection or Sends Invalid Data.
   * </pre>
   *
   * <code>EXTERNAL = 8;</code>
   */
  public static final int EXTERNAL_VALUE = 8;
  /**
   * <pre>
   * The response contains invalid arguments.
   * </pre>
   *
   * <code>BAD_RESPONSE = 9;</code>
   */
  public static final int BAD_RESPONSE_VALUE = 9;
  /**
   * <pre>
   * Unknown error.
   * Errors raised by APIs that do not return enough error information
   * may be converted to this error.
   * Similar to HTTP status code 500
   * </pre>
   *
   * <code>UNKNOWN_ERROR = 10;</code>
   */
  public static final int UNKNOWN_ERROR_VALUE = 10;
  /**
   * <pre>
   * Quota and payment related error codes.
   * client request crossses the exisitng quta limits.
   * </pre>
   *
   * <code>QUOTA_LIMIT_EXCEED = 11;</code>
   */
  public static final int QUOTA_LIMIT_EXCEED_VALUE = 11;
  /**
   * <pre>
   * no valid quta available
   * </pre>
   *
   * <code>INVALID_QUOTA = 12;</code>
   */
  public static final int INVALID_QUOTA_VALUE = 12;
  /**
   * <pre>
   * no payment informtaion avaible
   * </pre>
   *
   * <code>PAYMENT_INFORMATION_UNAVAILABLE = 13;</code>
   */
  public static final int PAYMENT_INFORMATION_UNAVAILABLE_VALUE = 13;
  /**
   * <pre>
   * payment information not valid.
   * </pre>
   *
   * <code>INVALID_PAYMENT_INFORMATION = 14;</code>
   */
  public static final int INVALID_PAYMENT_INFORMATION_VALUE = 14;
  /**
   * <pre>
   * failed to transect the payment information
   * </pre>
   *
   * <code>TRANSACTION_FAILED = 15;</code>
   */
  public static final int TRANSACTION_FAILED_VALUE = 15;
  /**
   * <pre>
   * to give ARE_YOU_SURE option
   * </pre>
   *
   * <code>ARE_YOU_SURE = 16;</code>
   */
  public static final int ARE_YOU_SURE_VALUE = 16;
  /**
   * <pre>
   *invalid data
   * </pre>
   *
   * <code>INVALID_DATA = 17;</code>
   */
  public static final int INVALID_DATA_VALUE = 17;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StatusCode valueOf(int value) {
    return forNumber(value);
  }

  public static StatusCode forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 1: return FAILED;
      case 2: return UNAUTHORIZED;
      case 3: return BADREQUEST;
      case 4: return PERMISSION_DENIED;
      case 5: return NOT_FOUND;
      case 6: return UNIMPLEMENTED;
      case 7: return INTERNAL;
      case 8: return EXTERNAL;
      case 9: return BAD_RESPONSE;
      case 10: return UNKNOWN_ERROR;
      case 11: return QUOTA_LIMIT_EXCEED;
      case 12: return INVALID_QUOTA;
      case 13: return PAYMENT_INFORMATION_UNAVAILABLE;
      case 14: return INVALID_PAYMENT_INFORMATION;
      case 15: return TRANSACTION_FAILED;
      case 16: return ARE_YOU_SURE;
      case 17: return INVALID_DATA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
          public StatusCode findValueByNumber(int number) {
            return StatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.appscode.api.dtypes.TypeProto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final StatusCode[] VALUES = values();

  public static StatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:appscode.dtypes.StatusCode)
}
