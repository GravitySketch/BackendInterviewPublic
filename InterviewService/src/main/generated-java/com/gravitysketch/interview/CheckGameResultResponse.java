// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf type {@code gravi.interview.CheckGameResultResponse}
 */
public  final class CheckGameResultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravi.interview.CheckGameResultResponse)
    CheckGameResultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckGameResultResponse.newBuilder() to construct.
  private CheckGameResultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckGameResultResponse() {
    gameResult_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckGameResultResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckGameResultResponse(
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

            gameResult_ = rawValue;
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
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_CheckGameResultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_CheckGameResultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravitysketch.interview.CheckGameResultResponse.class, com.gravitysketch.interview.CheckGameResultResponse.Builder.class);
  }

  public static final int GAMERESULT_FIELD_NUMBER = 1;
  private int gameResult_;
  /**
   * <code>.gravi.interview.GameResult gameResult = 1;</code>
   * @return The enum numeric value on the wire for gameResult.
   */
  public int getGameResultValue() {
    return gameResult_;
  }
  /**
   * <code>.gravi.interview.GameResult gameResult = 1;</code>
   * @return The gameResult.
   */
  public com.gravitysketch.interview.GameResult getGameResult() {
    @SuppressWarnings("deprecation")
    com.gravitysketch.interview.GameResult result = com.gravitysketch.interview.GameResult.valueOf(gameResult_);
    return result == null ? com.gravitysketch.interview.GameResult.UNRECOGNIZED : result;
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
    if (gameResult_ != com.gravitysketch.interview.GameResult.WaitMoreJoin.getNumber()) {
      output.writeEnum(1, gameResult_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gameResult_ != com.gravitysketch.interview.GameResult.WaitMoreJoin.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, gameResult_);
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
    if (!(obj instanceof com.gravitysketch.interview.CheckGameResultResponse)) {
      return super.equals(obj);
    }
    com.gravitysketch.interview.CheckGameResultResponse other = (com.gravitysketch.interview.CheckGameResultResponse) obj;

    if (gameResult_ != other.gameResult_) return false;
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
    hash = (37 * hash) + GAMERESULT_FIELD_NUMBER;
    hash = (53 * hash) + gameResult_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.CheckGameResultResponse parseFrom(
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
  public static Builder newBuilder(com.gravitysketch.interview.CheckGameResultResponse prototype) {
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
   * Protobuf type {@code gravi.interview.CheckGameResultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravi.interview.CheckGameResultResponse)
      com.gravitysketch.interview.CheckGameResultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_CheckGameResultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_CheckGameResultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravitysketch.interview.CheckGameResultResponse.class, com.gravitysketch.interview.CheckGameResultResponse.Builder.class);
    }

    // Construct using com.gravitysketch.interview.CheckGameResultResponse.newBuilder()
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
      gameResult_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_CheckGameResultResponse_descriptor;
    }

    @java.lang.Override
    public com.gravitysketch.interview.CheckGameResultResponse getDefaultInstanceForType() {
      return com.gravitysketch.interview.CheckGameResultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravitysketch.interview.CheckGameResultResponse build() {
      com.gravitysketch.interview.CheckGameResultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravitysketch.interview.CheckGameResultResponse buildPartial() {
      com.gravitysketch.interview.CheckGameResultResponse result = new com.gravitysketch.interview.CheckGameResultResponse(this);
      result.gameResult_ = gameResult_;
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
      if (other instanceof com.gravitysketch.interview.CheckGameResultResponse) {
        return mergeFrom((com.gravitysketch.interview.CheckGameResultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravitysketch.interview.CheckGameResultResponse other) {
      if (other == com.gravitysketch.interview.CheckGameResultResponse.getDefaultInstance()) return this;
      if (other.gameResult_ != 0) {
        setGameResultValue(other.getGameResultValue());
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
      com.gravitysketch.interview.CheckGameResultResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gravitysketch.interview.CheckGameResultResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gameResult_ = 0;
    /**
     * <code>.gravi.interview.GameResult gameResult = 1;</code>
     * @return The enum numeric value on the wire for gameResult.
     */
    public int getGameResultValue() {
      return gameResult_;
    }
    /**
     * <code>.gravi.interview.GameResult gameResult = 1;</code>
     * @param value The enum numeric value on the wire for gameResult to set.
     * @return This builder for chaining.
     */
    public Builder setGameResultValue(int value) {
      gameResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gravi.interview.GameResult gameResult = 1;</code>
     * @return The gameResult.
     */
    public com.gravitysketch.interview.GameResult getGameResult() {
      @SuppressWarnings("deprecation")
      com.gravitysketch.interview.GameResult result = com.gravitysketch.interview.GameResult.valueOf(gameResult_);
      return result == null ? com.gravitysketch.interview.GameResult.UNRECOGNIZED : result;
    }
    /**
     * <code>.gravi.interview.GameResult gameResult = 1;</code>
     * @param value The gameResult to set.
     * @return This builder for chaining.
     */
    public Builder setGameResult(com.gravitysketch.interview.GameResult value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gameResult_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gravi.interview.GameResult gameResult = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameResult() {
      
      gameResult_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gravi.interview.CheckGameResultResponse)
  }

  // @@protoc_insertion_point(class_scope:gravi.interview.CheckGameResultResponse)
  private static final com.gravitysketch.interview.CheckGameResultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravitysketch.interview.CheckGameResultResponse();
  }

  public static com.gravitysketch.interview.CheckGameResultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckGameResultResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckGameResultResponse>() {
    @java.lang.Override
    public CheckGameResultResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckGameResultResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckGameResultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckGameResultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravitysketch.interview.CheckGameResultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

