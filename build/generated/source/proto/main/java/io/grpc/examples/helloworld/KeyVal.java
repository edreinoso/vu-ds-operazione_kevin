// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

/**
 * Protobuf type {@code helloworld.KeyVal}
 */
public final class KeyVal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.KeyVal)
    KeyValOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyVal.newBuilder() to construct.
  private KeyVal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyVal() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyVal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeyVal(
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

            k_ = input.readUInt64();
            break;
          }
          case 16: {

            v_ = input.readUInt64();
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
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KeyVal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KeyVal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.helloworld.KeyVal.class, io.grpc.examples.helloworld.KeyVal.Builder.class);
  }

  public static final int K_FIELD_NUMBER = 1;
  private long k_;
  /**
   * <code>uint64 k = 1;</code>
   * @return The k.
   */
  @java.lang.Override
  public long getK() {
    return k_;
  }

  public static final int V_FIELD_NUMBER = 2;
  private long v_;
  /**
   * <code>uint64 v = 2;</code>
   * @return The v.
   */
  @java.lang.Override
  public long getV() {
    return v_;
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
    if (k_ != 0L) {
      output.writeUInt64(1, k_);
    }
    if (v_ != 0L) {
      output.writeUInt64(2, v_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (k_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, k_);
    }
    if (v_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, v_);
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
    if (!(obj instanceof io.grpc.examples.helloworld.KeyVal)) {
      return super.equals(obj);
    }
    io.grpc.examples.helloworld.KeyVal other = (io.grpc.examples.helloworld.KeyVal) obj;

    if (getK()
        != other.getK()) return false;
    if (getV()
        != other.getV()) return false;
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
    hash = (37 * hash) + K_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getK());
    hash = (37 * hash) + V_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getV());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KeyVal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KeyVal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KeyVal parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.helloworld.KeyVal prototype) {
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
   * Protobuf type {@code helloworld.KeyVal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.KeyVal)
      io.grpc.examples.helloworld.KeyValOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KeyVal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KeyVal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.helloworld.KeyVal.class, io.grpc.examples.helloworld.KeyVal.Builder.class);
    }

    // Construct using io.grpc.examples.helloworld.KeyVal.newBuilder()
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
      k_ = 0L;

      v_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KeyVal_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KeyVal getDefaultInstanceForType() {
      return io.grpc.examples.helloworld.KeyVal.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KeyVal build() {
      io.grpc.examples.helloworld.KeyVal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KeyVal buildPartial() {
      io.grpc.examples.helloworld.KeyVal result = new io.grpc.examples.helloworld.KeyVal(this);
      result.k_ = k_;
      result.v_ = v_;
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
      if (other instanceof io.grpc.examples.helloworld.KeyVal) {
        return mergeFrom((io.grpc.examples.helloworld.KeyVal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.helloworld.KeyVal other) {
      if (other == io.grpc.examples.helloworld.KeyVal.getDefaultInstance()) return this;
      if (other.getK() != 0L) {
        setK(other.getK());
      }
      if (other.getV() != 0L) {
        setV(other.getV());
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
      io.grpc.examples.helloworld.KeyVal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.helloworld.KeyVal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long k_ ;
    /**
     * <code>uint64 k = 1;</code>
     * @return The k.
     */
    @java.lang.Override
    public long getK() {
      return k_;
    }
    /**
     * <code>uint64 k = 1;</code>
     * @param value The k to set.
     * @return This builder for chaining.
     */
    public Builder setK(long value) {
      
      k_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 k = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearK() {
      
      k_ = 0L;
      onChanged();
      return this;
    }

    private long v_ ;
    /**
     * <code>uint64 v = 2;</code>
     * @return The v.
     */
    @java.lang.Override
    public long getV() {
      return v_;
    }
    /**
     * <code>uint64 v = 2;</code>
     * @param value The v to set.
     * @return This builder for chaining.
     */
    public Builder setV(long value) {
      
      v_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 v = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearV() {
      
      v_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:helloworld.KeyVal)
  }

  // @@protoc_insertion_point(class_scope:helloworld.KeyVal)
  private static final io.grpc.examples.helloworld.KeyVal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.helloworld.KeyVal();
  }

  public static io.grpc.examples.helloworld.KeyVal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyVal>
      PARSER = new com.google.protobuf.AbstractParser<KeyVal>() {
    @java.lang.Override
    public KeyVal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeyVal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeyVal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyVal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.helloworld.KeyVal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

