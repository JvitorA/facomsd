// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Command.proto

package com.ufu.jvitoraa.interaction;

/**
 * Protobuf type {@code com.ufu.jvitoraa.interaction.ReadCommand}
 */
public  final class ReadCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ufu.jvitoraa.interaction.ReadCommand)
    ReadCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadCommand.newBuilder() to construct.
  private ReadCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadCommand() {
    readVal_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadCommand(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            readVal_ = input.readInt64();
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
    return com.ufu.jvitoraa.interaction.Command.internal_static_com_ufu_jvitoraa_interaction_ReadCommand_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ufu.jvitoraa.interaction.Command.internal_static_com_ufu_jvitoraa_interaction_ReadCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ufu.jvitoraa.interaction.ReadCommand.class, com.ufu.jvitoraa.interaction.ReadCommand.Builder.class);
  }

  public static final int READVAL_FIELD_NUMBER = 1;
  private long readVal_;
  /**
   * <code>int64 readVal = 1;</code>
   */
  public long getReadVal() {
    return readVal_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (readVal_ != 0L) {
      output.writeInt64(1, readVal_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (readVal_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, readVal_);
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
    if (!(obj instanceof com.ufu.jvitoraa.interaction.ReadCommand)) {
      return super.equals(obj);
    }
    com.ufu.jvitoraa.interaction.ReadCommand other = (com.ufu.jvitoraa.interaction.ReadCommand) obj;

    boolean result = true;
    result = result && (getReadVal()
        == other.getReadVal());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + READVAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReadVal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ufu.jvitoraa.interaction.ReadCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ufu.jvitoraa.interaction.ReadCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.ufu.jvitoraa.interaction.ReadCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ufu.jvitoraa.interaction.ReadCommand)
      com.ufu.jvitoraa.interaction.ReadCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ufu.jvitoraa.interaction.Command.internal_static_com_ufu_jvitoraa_interaction_ReadCommand_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ufu.jvitoraa.interaction.Command.internal_static_com_ufu_jvitoraa_interaction_ReadCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ufu.jvitoraa.interaction.ReadCommand.class, com.ufu.jvitoraa.interaction.ReadCommand.Builder.class);
    }

    // Construct using com.ufu.jvitoraa.interaction.ReadCommand.newBuilder()
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
    public Builder clear() {
      super.clear();
      readVal_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ufu.jvitoraa.interaction.Command.internal_static_com_ufu_jvitoraa_interaction_ReadCommand_descriptor;
    }

    public com.ufu.jvitoraa.interaction.ReadCommand getDefaultInstanceForType() {
      return com.ufu.jvitoraa.interaction.ReadCommand.getDefaultInstance();
    }

    public com.ufu.jvitoraa.interaction.ReadCommand build() {
      com.ufu.jvitoraa.interaction.ReadCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ufu.jvitoraa.interaction.ReadCommand buildPartial() {
      com.ufu.jvitoraa.interaction.ReadCommand result = new com.ufu.jvitoraa.interaction.ReadCommand(this);
      result.readVal_ = readVal_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ufu.jvitoraa.interaction.ReadCommand) {
        return mergeFrom((com.ufu.jvitoraa.interaction.ReadCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ufu.jvitoraa.interaction.ReadCommand other) {
      if (other == com.ufu.jvitoraa.interaction.ReadCommand.getDefaultInstance()) return this;
      if (other.getReadVal() != 0L) {
        setReadVal(other.getReadVal());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ufu.jvitoraa.interaction.ReadCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ufu.jvitoraa.interaction.ReadCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long readVal_ ;
    /**
     * <code>int64 readVal = 1;</code>
     */
    public long getReadVal() {
      return readVal_;
    }
    /**
     * <code>int64 readVal = 1;</code>
     */
    public Builder setReadVal(long value) {
      
      readVal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 readVal = 1;</code>
     */
    public Builder clearReadVal() {
      
      readVal_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ufu.jvitoraa.interaction.ReadCommand)
  }

  // @@protoc_insertion_point(class_scope:com.ufu.jvitoraa.interaction.ReadCommand)
  private static final com.ufu.jvitoraa.interaction.ReadCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ufu.jvitoraa.interaction.ReadCommand();
  }

  public static com.ufu.jvitoraa.interaction.ReadCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadCommand>
      PARSER = new com.google.protobuf.AbstractParser<ReadCommand>() {
    public ReadCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadCommand> getParserForType() {
    return PARSER;
  }

  public com.ufu.jvitoraa.interaction.ReadCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

