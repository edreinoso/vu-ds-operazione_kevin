// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

public interface KVListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.KVList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  java.util.List<io.grpc.examples.helloworld.KeyVal> 
      getKvsList();
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  io.grpc.examples.helloworld.KeyVal getKvs(int index);
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  int getKvsCount();
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  java.util.List<? extends io.grpc.examples.helloworld.KeyValOrBuilder> 
      getKvsOrBuilderList();
  /**
   * <code>repeated .helloworld.KeyVal kvs = 4;</code>
   */
  io.grpc.examples.helloworld.KeyValOrBuilder getKvsOrBuilder(
      int index);
}
