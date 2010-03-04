// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CellMessage.proto

package org.apache.hadoop.hbase.stargate.protobuf.generated;

public final class CellMessage {
  private CellMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Cell extends
      com.google.protobuf.GeneratedMessage {
    // Use Cell.newBuilder() to construct.
    private Cell() {
      initFields();
    }
    private Cell(boolean noInit) {}
    
    private static final Cell defaultInstance;
    public static Cell getDefaultInstance() {
      return defaultInstance;
    }
    
    public Cell getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_fieldAccessorTable;
    }
    
    // optional bytes row = 1;
    public static final int ROW_FIELD_NUMBER = 1;
    private boolean hasRow;
    private com.google.protobuf.ByteString row_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasRow() { return hasRow; }
    public com.google.protobuf.ByteString getRow() { return row_; }
    
    // optional bytes column = 2;
    public static final int COLUMN_FIELD_NUMBER = 2;
    private boolean hasColumn;
    private com.google.protobuf.ByteString column_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasColumn() { return hasColumn; }
    public com.google.protobuf.ByteString getColumn() { return column_; }
    
    // optional int64 timestamp = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private boolean hasTimestamp;
    private long timestamp_ = 0L;
    public boolean hasTimestamp() { return hasTimestamp; }
    public long getTimestamp() { return timestamp_; }
    
    // optional bytes data = 4;
    public static final int DATA_FIELD_NUMBER = 4;
    private boolean hasData;
    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasData() { return hasData; }
    public com.google.protobuf.ByteString getData() { return data_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRow()) {
        output.writeBytes(1, getRow());
      }
      if (hasColumn()) {
        output.writeBytes(2, getColumn());
      }
      if (hasTimestamp()) {
        output.writeInt64(3, getTimestamp());
      }
      if (hasData()) {
        output.writeBytes(4, getData());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRow()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getRow());
      }
      if (hasColumn()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getColumn());
      }
      if (hasTimestamp()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getTimestamp());
      }
      if (hasData()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getData());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell result;
      
      // Construct using org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell();
        return builder;
      }
      
      protected org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell) {
          return mergeFrom((org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell other) {
        if (other == org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.getDefaultInstance()) return this;
        if (other.hasRow()) {
          setRow(other.getRow());
        }
        if (other.hasColumn()) {
          setColumn(other.getColumn());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setRow(input.readBytes());
              break;
            }
            case 18: {
              setColumn(input.readBytes());
              break;
            }
            case 24: {
              setTimestamp(input.readInt64());
              break;
            }
            case 34: {
              setData(input.readBytes());
              break;
            }
          }
        }
      }
      
      
      // optional bytes row = 1;
      public boolean hasRow() {
        return result.hasRow();
      }
      public com.google.protobuf.ByteString getRow() {
        return result.getRow();
      }
      public Builder setRow(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRow = true;
        result.row_ = value;
        return this;
      }
      public Builder clearRow() {
        result.hasRow = false;
        result.row_ = getDefaultInstance().getRow();
        return this;
      }
      
      // optional bytes column = 2;
      public boolean hasColumn() {
        return result.hasColumn();
      }
      public com.google.protobuf.ByteString getColumn() {
        return result.getColumn();
      }
      public Builder setColumn(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasColumn = true;
        result.column_ = value;
        return this;
      }
      public Builder clearColumn() {
        result.hasColumn = false;
        result.column_ = getDefaultInstance().getColumn();
        return this;
      }
      
      // optional int64 timestamp = 3;
      public boolean hasTimestamp() {
        return result.hasTimestamp();
      }
      public long getTimestamp() {
        return result.getTimestamp();
      }
      public Builder setTimestamp(long value) {
        result.hasTimestamp = true;
        result.timestamp_ = value;
        return this;
      }
      public Builder clearTimestamp() {
        result.hasTimestamp = false;
        result.timestamp_ = 0L;
        return this;
      }
      
      // optional bytes data = 4;
      public boolean hasData() {
        return result.hasData();
      }
      public com.google.protobuf.ByteString getData() {
        return result.getData();
      }
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasData = true;
        result.data_ = value;
        return this;
      }
      public Builder clearData() {
        result.hasData = false;
        result.data_ = getDefaultInstance().getData();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.stargate.protobuf.generated.Cell)
    }
    
    static {
      defaultInstance = new Cell(true);
      org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.stargate.protobuf.generated.Cell)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CellMessage.proto\0223org.apache.hadoop.h" +
      "base.stargate.protobuf.generated\"D\n\004Cell" +
      "\022\013\n\003row\030\001 \001(\014\022\016\n\006column\030\002 \001(\014\022\021\n\ttimesta" +
      "mp\030\003 \001(\003\022\014\n\004data\030\004 \001(\014"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_stargate_protobuf_generated_Cell_descriptor,
              new java.lang.String[] { "Row", "Column", "Timestamp", "Data", },
              org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.class,
              org.apache.hadoop.hbase.stargate.protobuf.generated.CellMessage.Cell.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
