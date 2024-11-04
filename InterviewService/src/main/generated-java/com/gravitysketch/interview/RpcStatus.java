// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf enum {@code gravi.interview.RpcStatus}
 */
public enum RpcStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NoError = 0;</code>
   */
  NoError(0),
  /**
   * <code>UnknownStatus = 1;</code>
   */
  UnknownStatus(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NoError = 0;</code>
   */
  public static final int NoError_VALUE = 0;
  /**
   * <code>UnknownStatus = 1;</code>
   */
  public static final int UnknownStatus_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RpcStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RpcStatus forNumber(int value) {
    switch (value) {
      case 0: return NoError;
      case 1: return UnknownStatus;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RpcStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RpcStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RpcStatus>() {
          public RpcStatus findValueByNumber(int number) {
            return RpcStatus.forNumber(number);
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
    return com.gravitysketch.interview.Rpc.getDescriptor().getEnumTypes().get(1);
  }

  private static final RpcStatus[] VALUES = values();

  public static RpcStatus valueOf(
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

  private RpcStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:gravi.interview.RpcStatus)
}
