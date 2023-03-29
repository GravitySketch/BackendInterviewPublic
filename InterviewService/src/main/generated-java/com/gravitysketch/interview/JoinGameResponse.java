// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf type {@code gravi.interview.JoinGameResponse}
 */
public  final class JoinGameResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravi.interview.JoinGameResponse)
    JoinGameResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinGameResponse.newBuilder() to construct.
  private JoinGameResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinGameResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinGameResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JoinGameResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_JoinGameResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_JoinGameResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravitysketch.interview.JoinGameResponse.class, com.gravitysketch.interview.JoinGameResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code gravi.interview.JoinGameResponse.JoinResult}
   */
  public enum JoinResult
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>JoinSuccess = 0;</code>
     */
    JoinSuccess(0),
    /**
     * <code>NoGame = 1;</code>
     */
    NoGame(1),
    /**
     * <code>GameFinished = 2;</code>
     */
    GameFinished(2),
    /**
     * <code>GameIsFull = 3;</code>
     */
    GameIsFull(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>JoinSuccess = 0;</code>
     */
    public static final int JoinSuccess_VALUE = 0;
    /**
     * <code>NoGame = 1;</code>
     */
    public static final int NoGame_VALUE = 1;
    /**
     * <code>GameFinished = 2;</code>
     */
    public static final int GameFinished_VALUE = 2;
    /**
     * <code>GameIsFull = 3;</code>
     */
    public static final int GameIsFull_VALUE = 3;


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
    public static JoinResult valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JoinResult forNumber(int value) {
      switch (value) {
        case 0: return JoinSuccess;
        case 1: return NoGame;
        case 2: return GameFinished;
        case 3: return GameIsFull;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JoinResult>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JoinResult> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JoinResult>() {
            public JoinResult findValueByNumber(int number) {
              return JoinResult.forNumber(number);
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
      return com.gravitysketch.interview.JoinGameResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final JoinResult[] VALUES = values();

    public static JoinResult valueOf(
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

    private JoinResult(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:gravi.interview.JoinGameResponse.JoinResult)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
   * @return The result.
   */
  public com.gravitysketch.interview.JoinGameResponse.JoinResult getResult() {
    @SuppressWarnings("deprecation")
    com.gravitysketch.interview.JoinGameResponse.JoinResult result = com.gravitysketch.interview.JoinGameResponse.JoinResult.valueOf(result_);
    return result == null ? com.gravitysketch.interview.JoinGameResponse.JoinResult.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != com.gravitysketch.interview.JoinGameResponse.JoinResult.JoinSuccess.getNumber()) {
      output.writeEnum(1, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != com.gravitysketch.interview.JoinGameResponse.JoinResult.JoinSuccess.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.gravitysketch.interview.JoinGameResponse)) {
      return super.equals(obj);
    }
    com.gravitysketch.interview.JoinGameResponse other = (com.gravitysketch.interview.JoinGameResponse) obj;

    if (result_ != other.result_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.JoinGameResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gravitysketch.interview.JoinGameResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code gravi.interview.JoinGameResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravi.interview.JoinGameResponse)
      com.gravitysketch.interview.JoinGameResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_JoinGameResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_JoinGameResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravitysketch.interview.JoinGameResponse.class, com.gravitysketch.interview.JoinGameResponse.Builder.class);
    }

    // Construct using com.gravitysketch.interview.JoinGameResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_JoinGameResponse_descriptor;
    }

    @java.lang.Override
    public com.gravitysketch.interview.JoinGameResponse getDefaultInstanceForType() {
      return com.gravitysketch.interview.JoinGameResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravitysketch.interview.JoinGameResponse build() {
      com.gravitysketch.interview.JoinGameResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravitysketch.interview.JoinGameResponse buildPartial() {
      com.gravitysketch.interview.JoinGameResponse result = new com.gravitysketch.interview.JoinGameResponse(this);
      result.result_ = result_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravitysketch.interview.JoinGameResponse) {
        return mergeFrom((com.gravitysketch.interview.JoinGameResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravitysketch.interview.JoinGameResponse other) {
      if (other == com.gravitysketch.interview.JoinGameResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gravitysketch.interview.JoinGameResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gravitysketch.interview.JoinGameResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
     * @return The result.
     */
    public com.gravitysketch.interview.JoinGameResponse.JoinResult getResult() {
      @SuppressWarnings("deprecation")
      com.gravitysketch.interview.JoinGameResponse.JoinResult result = com.gravitysketch.interview.JoinGameResponse.JoinResult.valueOf(result_);
      return result == null ? com.gravitysketch.interview.JoinGameResponse.JoinResult.UNRECOGNIZED : result;
    }
    /**
     * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(com.gravitysketch.interview.JoinGameResponse.JoinResult value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gravi.interview.JoinGameResponse.JoinResult result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:gravi.interview.JoinGameResponse)
  }

  // @@protoc_insertion_point(class_scope:gravi.interview.JoinGameResponse)
  private static final com.gravitysketch.interview.JoinGameResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravitysketch.interview.JoinGameResponse();
  }

  public static com.gravitysketch.interview.JoinGameResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinGameResponse>
      PARSER = new com.google.protobuf.AbstractParser<JoinGameResponse>() {
    @java.lang.Override
    public JoinGameResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JoinGameResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinGameResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinGameResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravitysketch.interview.JoinGameResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

