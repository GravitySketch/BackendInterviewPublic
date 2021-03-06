// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

/**
 * Protobuf type {@code gravi.interview.HelloWorldRequest}
 */
public  final class HelloWorldRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravi.interview.HelloWorldRequest)
    HelloWorldRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloWorldRequest.newBuilder() to construct.
  private HelloWorldRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloWorldRequest() {
    greatingMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloWorldRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloWorldRequest(
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

            greatingMessage_ = s;
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
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HelloWorldRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HelloWorldRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravitysketch.interview.HelloWorldRequest.class, com.gravitysketch.interview.HelloWorldRequest.Builder.class);
  }

  public static final int GREATINGMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object greatingMessage_;
  /**
   * <code>string greatingMessage = 1;</code>
   * @return The greatingMessage.
   */
  public java.lang.String getGreatingMessage() {
    java.lang.Object ref = greatingMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      greatingMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string greatingMessage = 1;</code>
   * @return The bytes for greatingMessage.
   */
  public com.google.protobuf.ByteString
      getGreatingMessageBytes() {
    java.lang.Object ref = greatingMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      greatingMessage_ = b;
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
    if (!getGreatingMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, greatingMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGreatingMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, greatingMessage_);
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
    if (!(obj instanceof com.gravitysketch.interview.HelloWorldRequest)) {
      return super.equals(obj);
    }
    com.gravitysketch.interview.HelloWorldRequest other = (com.gravitysketch.interview.HelloWorldRequest) obj;

    if (!getGreatingMessage()
        .equals(other.getGreatingMessage())) return false;
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
    hash = (37 * hash) + GREATINGMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getGreatingMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravitysketch.interview.HelloWorldRequest parseFrom(
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
  public static Builder newBuilder(com.gravitysketch.interview.HelloWorldRequest prototype) {
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
   * Protobuf type {@code gravi.interview.HelloWorldRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravi.interview.HelloWorldRequest)
      com.gravitysketch.interview.HelloWorldRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HelloWorldRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HelloWorldRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravitysketch.interview.HelloWorldRequest.class, com.gravitysketch.interview.HelloWorldRequest.Builder.class);
    }

    // Construct using com.gravitysketch.interview.HelloWorldRequest.newBuilder()
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
      greatingMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravitysketch.interview.Rpc.internal_static_gravi_interview_HelloWorldRequest_descriptor;
    }

    @java.lang.Override
    public com.gravitysketch.interview.HelloWorldRequest getDefaultInstanceForType() {
      return com.gravitysketch.interview.HelloWorldRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravitysketch.interview.HelloWorldRequest build() {
      com.gravitysketch.interview.HelloWorldRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravitysketch.interview.HelloWorldRequest buildPartial() {
      com.gravitysketch.interview.HelloWorldRequest result = new com.gravitysketch.interview.HelloWorldRequest(this);
      result.greatingMessage_ = greatingMessage_;
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
      if (other instanceof com.gravitysketch.interview.HelloWorldRequest) {
        return mergeFrom((com.gravitysketch.interview.HelloWorldRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravitysketch.interview.HelloWorldRequest other) {
      if (other == com.gravitysketch.interview.HelloWorldRequest.getDefaultInstance()) return this;
      if (!other.getGreatingMessage().isEmpty()) {
        greatingMessage_ = other.greatingMessage_;
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
      com.gravitysketch.interview.HelloWorldRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gravitysketch.interview.HelloWorldRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object greatingMessage_ = "";
    /**
     * <code>string greatingMessage = 1;</code>
     * @return The greatingMessage.
     */
    public java.lang.String getGreatingMessage() {
      java.lang.Object ref = greatingMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        greatingMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string greatingMessage = 1;</code>
     * @return The bytes for greatingMessage.
     */
    public com.google.protobuf.ByteString
        getGreatingMessageBytes() {
      java.lang.Object ref = greatingMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        greatingMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string greatingMessage = 1;</code>
     * @param value The greatingMessage to set.
     * @return This builder for chaining.
     */
    public Builder setGreatingMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      greatingMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string greatingMessage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGreatingMessage() {
      
      greatingMessage_ = getDefaultInstance().getGreatingMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string greatingMessage = 1;</code>
     * @param value The bytes for greatingMessage to set.
     * @return This builder for chaining.
     */
    public Builder setGreatingMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      greatingMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:gravi.interview.HelloWorldRequest)
  }

  // @@protoc_insertion_point(class_scope:gravi.interview.HelloWorldRequest)
  private static final com.gravitysketch.interview.HelloWorldRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravitysketch.interview.HelloWorldRequest();
  }

  public static com.gravitysketch.interview.HelloWorldRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloWorldRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloWorldRequest>() {
    @java.lang.Override
    public HelloWorldRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloWorldRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloWorldRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloWorldRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravitysketch.interview.HelloWorldRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

