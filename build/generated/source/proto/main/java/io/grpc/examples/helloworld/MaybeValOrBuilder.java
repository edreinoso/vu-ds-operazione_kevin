// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

public interface MaybeValOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.MaybeVal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .helloworld.Val val = 1;</code>
   * @return Whether the val field is set.
   */
  boolean hasVal();
  /**
   * <code>optional .helloworld.Val val = 1;</code>
   * @return The val.
   */
  io.grpc.examples.helloworld.Val getVal();
  /**
   * <code>optional .helloworld.Val val = 1;</code>
   */
  io.grpc.examples.helloworld.ValOrBuilder getValOrBuilder();
}