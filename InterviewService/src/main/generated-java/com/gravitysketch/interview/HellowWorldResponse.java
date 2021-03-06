// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf type {@code gravi.interview.HellowWorldResponse}
 */
public  final class HellowWorldResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravi.interview.HellowWorldResponse)
    HellowWorldResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HellowWorldResponse.newBuilder() to construct.
  private HellowWorldResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HellowWorldResponse() {
    returnedMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HellowWorldResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HellowWorldResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            returnedMessage_ = s;
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
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HellowWorldResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HellowWorldResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravitysketch.interview.HellowWorldResponse.class, com.gravitysketch.interview.HellowWorldResponse.Builder.class);
  }

  public static final int RETURNEDMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object returnedMessage_;
  /**
   * <code>string returnedMessage = 1;</code>
   * @return The returnedMessage.
   */
  public java.lang.String getReturnedMessage() {
    java.lang.Object ref = returnedMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      returnedMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string returnedMessage = 1;</code>
   * @return The bytes for returnedMessage.
   */
  public com.google.protobuf.ByteString
      getReturnedMessageBytes() {
    java.lang.Object ref = returnedMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      returnedMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getReturnedMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, returnedMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReturnedMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, returnedMessage_);
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
    if (!(obj instanceof com.gravitysketch.interview.HellowWorldResponse)) {
      return super.equals(obj);
    }
    com.gravitysketch.interview.HellowWorldResponse other = (com.gravitysketch.interview.HellowWorldResponse) obj;

    if (!getReturnedMessage()
        .equals(other.getReturnedMessage())) return false;
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
    hash = (37 * hash) + RETURNEDMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getReturnedMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HellowWorldResponse parseFrom(
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
  public static Builder newBuilder(com.gravitysketch.interview.HellowWorldResponse prototype) {
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
   * Protobuf type {@code gravi.interview.HellowWorldResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravi.interview.HellowWorldResponse)
      com.gravitysketch.interview.HellowWorldResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HellowWorldResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HellowWorldResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravitysketch.interview.HellowWorldResponse.class, com.gravitysketch.interview.HellowWorldResponse.Builder.class);
    }

    // Construct using com.gravitysketch.interview.HellowWorldResponse.newBuilder()
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
      returnedMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HellowWorldResponse_descriptor;
    }

    @java.lang.Override
    public com.gravitysketch.interview.HellowWorldResponse getDefaultInstanceForType() {
      return com.gravitysketch.interview.HellowWorldResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravitysketch.interview.HellowWorldResponse build() {
      com.gravitysketch.interview.HellowWorldResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravitysketch.interview.HellowWorldResponse buildPartial() {
      com.gravitysketch.interview.HellowWorldResponse result = new com.gravitysketch.interview.HellowWorldResponse(this);
      result.returnedMessage_ = returnedMessage_;
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
      if (other instanceof com.gravitysketch.interview.HellowWorldResponse) {
        return mergeFrom((com.gravitysketch.interview.HellowWorldResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravitysketch.interview.HellowWorldResponse other) {
      if (other == com.gravitysketch.interview.HellowWorldResponse.getDefaultInstance()) return this;
      if (!other.getReturnedMessage().isEmpty()) {
        returnedMessage_ = other.returnedMessage_;
        onChanged();
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
      com.gravitysketch.interview.HellowWorldResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gravitysketch.interview.HellowWorldResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object returnedMessage_ = "";
    /**
     * <code>string returnedMessage = 1;</code>
     * @return The returnedMessage.
     */
    public java.lang.String getReturnedMessage() {
      java.lang.Object ref = returnedMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        returnedMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string returnedMessage = 1;</code>
     * @return The bytes for returnedMessage.
     */
    public com.google.protobuf.ByteString
        getReturnedMessageBytes() {
      java.lang.Object ref = returnedMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        returnedMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string returnedMessage = 1;</code>
     * @param value The returnedMessage to set.
     * @return This builder for chaining.
     */
    public Builder setReturnedMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      returnedMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string returnedMessage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReturnedMessage() {
      
      returnedMessage_ = getDefaultInstance().getReturnedMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string returnedMessage = 1;</code>
     * @param value The bytes for returnedMessage to set.
     * @return This builder for chaining.
     */
    public Builder setReturnedMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      returnedMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:gravi.interview.HellowWorldResponse)
  }

  // @@protoc_insertion_point(class_scope:gravi.interview.HellowWorldResponse)
  private static final com.gravitysketch.interview.HellowWorldResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravitysketch.interview.HellowWorldResponse();
  }

  public static com.gravitysketch.interview.HellowWorldResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HellowWorldResponse>
      PARSER = new com.google.protobuf.AbstractParser<HellowWorldResponse>() {
    @java.lang.Override
    public HellowWorldResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HellowWorldResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HellowWorldResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HellowWorldResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravitysketch.interview.HellowWorldResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

