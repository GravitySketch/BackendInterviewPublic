// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf enum {@code gravi.interview.RpcType}
 */
public enum RpcType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HellowWorld = 0;</code>
   */
  HellowWorld(0),
  /**
   * <code>CreateGame = 1;</code>
   */
  CreateGame(1),
  /**
   * <code>JoinGame = 2;</code>
   */
  JoinGame(2),
  /**
   * <code>TakePosition = 3;</code>
   */
  TakePosition(3),
  /**
   * <code>CheckGameResult = 4;</code>
   */
  CheckGameResult(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HellowWorld = 0;</code>
   */
  public static final int HellowWorld_VALUE = 0;
  /**
   * <code>CreateGame = 1;</code>
   */
  public static final int CreateGame_VALUE = 1;
  /**
   * <code>JoinGame = 2;</code>
   */
  public static final int JoinGame_VALUE = 2;
  /**
   * <code>TakePosition = 3;</code>
   */
  public static final int TakePosition_VALUE = 3;
  /**
   * <code>CheckGameResult = 4;</code>
   */
  public static final int CheckGameResult_VALUE = 4;


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
  public static RpcType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RpcType forNumber(int value) {
    switch (value) {
      case 0: return HellowWorld;
      case 1: return CreateGame;
      case 2: return JoinGame;
      case 3: return TakePosition;
      case 4: return CheckGameResult;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RpcType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RpcType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RpcType>() {
          public RpcType findValueByNumber(int number) {
            return RpcType.forNumber(number);
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
    return com.gravitysketch.interview.Rpc.getDescriptor().getEnumTypes().get(0);
  }

  private static final RpcType[] VALUES = values();

  public static RpcType valueOf(
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

  private RpcType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:gravi.interview.RpcType)
}

