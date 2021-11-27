// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

/**
 * Protobuf type {@code helloworld.KVList}
 */
public final class KVList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.KVList)
    KVListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KVList.newBuilder() to construct.
  private KVList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KVList() {
    kvs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KVList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KVList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              kvs_ = new java.util.ArrayList<io.grpc.examples.helloworld.KeyVal>();
              mutable_bitField0_ |= 0x00000001;
            }
            kvs_.add(
                input.readMessage(io.grpc.examples.helloworld.KeyVal.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        kvs_ = java.util.Collections.unmodifiableList(kvs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KVList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KVList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.helloworld.KVList.class, io.grpc.examples.helloworld.KVList.Builder.class);
  }

  public static final int KVS_FIELD_NUMBER = 4;
  private java.util.List<io.grpc.examples.helloworld.KeyVal> kvs_;
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  @java.lang.Override
  public java.util.List<io.grpc.examples.helloworld.KeyVal> getKvsList() {
    return kvs_;
  }
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grpc.examples.helloworld.KeyValOrBuilder> 
      getKvsOrBuilderList() {
    return kvs_;
  }
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  @java.lang.Override
  public int getKvsCount() {
    return kvs_.size();
  }
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  @java.lang.Override
  public io.grpc.examples.helloworld.KeyVal getKvs(int index) {
    return kvs_.get(index);
  }
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  @java.lang.Override
  public io.grpc.examples.helloworld.KeyValOrBuilder getKvsOrBuilder(
      int index) {
    return kvs_.get(index);
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
    for (int i = 0; i < kvs_.size(); i++) {
      output.writeMessage(4, kvs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < kvs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, kvs_.get(i));
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
    if (!(obj instanceof io.grpc.examples.helloworld.KVList)) {
      return super.equals(obj);
    }
    io.grpc.examples.helloworld.KVList other = (io.grpc.examples.helloworld.KVList) obj;

    if (!getKvsList()
        .equals(other.getKvsList())) return false;
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
    if (getKvsCount() > 0) {
      hash = (37 * hash) + KVS_FIELD_NUMBER;
      hash = (53 * hash) + getKvsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.helloworld.KVList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KVList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KVList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.helloworld.KVList parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.helloworld.KVList prototype) {
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
   * Protobuf type {@code helloworld.KVList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.KVList)
      io.grpc.examples.helloworld.KVListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KVList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KVList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.helloworld.KVList.class, io.grpc.examples.helloworld.KVList.Builder.class);
    }

    // Construct using io.grpc.examples.helloworld.KVList.newBuilder()
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
        getKvsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_KVList_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KVList getDefaultInstanceForType() {
      return io.grpc.examples.helloworld.KVList.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KVList build() {
      io.grpc.examples.helloworld.KVList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.helloworld.KVList buildPartial() {
      io.grpc.examples.helloworld.KVList result = new io.grpc.examples.helloworld.KVList(this);
      int from_bitField0_ = bitField0_;
      if (kvsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          kvs_ = java.util.Collections.unmodifiableList(kvs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.kvs_ = kvs_;
      } else {
        result.kvs_ = kvsBuilder_.build();
      }
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
      if (other instanceof io.grpc.examples.helloworld.KVList) {
        return mergeFrom((io.grpc.examples.helloworld.KVList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.helloworld.KVList other) {
      if (other == io.grpc.examples.helloworld.KVList.getDefaultInstance()) return this;
      if (kvsBuilder_ == null) {
        if (!other.kvs_.isEmpty()) {
          if (kvs_.isEmpty()) {
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKvsIsMutable();
            kvs_.addAll(other.kvs_);
          }
          onChanged();
        }
      } else {
        if (!other.kvs_.isEmpty()) {
          if (kvsBuilder_.isEmpty()) {
            kvsBuilder_.dispose();
            kvsBuilder_ = null;
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            kvsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKvsFieldBuilder() : null;
          } else {
            kvsBuilder_.addAllMessages(other.kvs_);
          }
        }
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
      io.grpc.examples.helloworld.KVList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.helloworld.KVList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.examples.helloworld.KeyVal> kvs_ =
      java.util.Collections.emptyList();
    private void ensureKvsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        kvs_ = new java.util.ArrayList<io.grpc.examples.helloworld.KeyVal>(kvs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.helloworld.KeyVal, io.grpc.examples.helloworld.KeyVal.Builder, io.grpc.examples.helloworld.KeyValOrBuilder> kvsBuilder_;

    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public java.util.List<io.grpc.examples.helloworld.KeyVal> getKvsList() {
      if (kvsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kvs_);
      } else {
        return kvsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public int getKvsCount() {
      if (kvsBuilder_ == null) {
        return kvs_.size();
      } else {
        return kvsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public io.grpc.examples.helloworld.KeyVal getKvs(int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);
      } else {
        return kvsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder setKvs(
        int index, io.grpc.examples.helloworld.KeyVal value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.set(index, value);
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder setKvs(
        int index, io.grpc.examples.helloworld.KeyVal.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.set(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder addKvs(io.grpc.examples.helloworld.KeyVal value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder addKvs(
        int index, io.grpc.examples.helloworld.KeyVal value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(index, value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder addKvs(
        io.grpc.examples.helloworld.KeyVal.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder addKvs(
        int index, io.grpc.examples.helloworld.KeyVal.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder addAllKvs(
        java.lang.Iterable<? extends io.grpc.examples.helloworld.KeyVal> values) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kvs_);
        onChanged();
      } else {
        kvsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder clearKvs() {
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public Builder removeKvs(int index) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.remove(index);
        onChanged();
      } else {
        kvsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public io.grpc.examples.helloworld.KeyVal.Builder getKvsBuilder(
        int index) {
      return getKvsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public io.grpc.examples.helloworld.KeyValOrBuilder getKvsOrBuilder(
        int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);  } else {
        return kvsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public java.util.List<? extends io.grpc.examples.helloworld.KeyValOrBuilder> 
         getKvsOrBuilderList() {
      if (kvsBuilder_ != null) {
        return kvsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kvs_);
      }
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public io.grpc.examples.helloworld.KeyVal.Builder addKvsBuilder() {
      return getKvsFieldBuilder().addBuilder(
          io.grpc.examples.helloworld.KeyVal.getDefaultInstance());
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public io.grpc.examples.helloworld.KeyVal.Builder addKvsBuilder(
        int index) {
      return getKvsFieldBuilder().addBuilder(
          index, io.grpc.examples.helloworld.KeyVal.getDefaultInstance());
    }
    /**
     * <code>repeated .helloworld.KeyVal kvs = 4;</code>
     */
    public java.util.List<io.grpc.examples.helloworld.KeyVal.Builder> 
         getKvsBuilderList() {
      return getKvsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.helloworld.KeyVal, io.grpc.examples.helloworld.KeyVal.Builder, io.grpc.examples.helloworld.KeyValOrBuilder> 
        getKvsFieldBuilder() {
      if (kvsBuilder_ == null) {
        kvsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.examples.helloworld.KeyVal, io.grpc.examples.helloworld.KeyVal.Builder, io.grpc.examples.helloworld.KeyValOrBuilder>(
                kvs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        kvs_ = null;
      }
      return kvsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:helloworld.KVList)
  }

  // @@protoc_insertion_point(class_scope:helloworld.KVList)
  private static final io.grpc.examples.helloworld.KVList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.helloworld.KVList();
  }

  public static io.grpc.examples.helloworld.KVList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KVList>
      PARSER = new com.google.protobuf.AbstractParser<KVList>() {
    @java.lang.Override
    public KVList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KVList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KVList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KVList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.helloworld.KVList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

