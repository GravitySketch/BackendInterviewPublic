// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.gravitysketch.interview;

public interface RpcRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravi.interview.RpcRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.gravi.interview.RpcType rpcType = 1;</code>
   * @return The enum numeric value on the wire for rpcType.
   */
  int getRpcTypeValue();
  /**
   * <code>.gravi.interview.RpcType rpcType = 1;</code>
   * @return The rpcType.
   */
  com.gravitysketch.interview.RpcType getRpcType();

  /**
   * <code>.gravi.interview.HelloWorldRequest helloWorldRequest = 10;</code>
   * @return Whether the helloWorldRequest field is set.
   */
  boolean hasHelloWorldRequest();
  /**
   * <code>.gravi.interview.HelloWorldRequest helloWorldRequest = 10;</code>
   * @return The helloWorldRequest.
   */
  com.gravitysketch.interview.HelloWorldRequest getHelloWorldRequest();
  /**
   * <code>.gravi.interview.HelloWorldRequest helloWorldRequest = 10;</code>
   */
  com.gravitysketch.interview.HelloWorldRequestOrBuilder getHelloWorldRequestOrBuilder();

  /**
   * <code>.gravi.interview.CreateGameRequest createGameRequest = 11;</code>
   * @return Whether the createGameRequest field is set.
   */
  boolean hasCreateGameRequest();
  /**
   * <code>.gravi.interview.CreateGameRequest createGameRequest = 11;</code>
   * @return The createGameRequest.
   */
  com.gravitysketch.interview.CreateGameRequest getCreateGameRequest();
  /**
   * <code>.gravi.interview.CreateGameRequest createGameRequest = 11;</code>
   */
  com.gravitysketch.interview.CreateGameRequestOrBuilder getCreateGameRequestOrBuilder();

  /**
   * <code>.gravi.interview.JoinGameRequest joinGameRequest = 12;</code>
   * @return Whether the joinGameRequest field is set.
   */
  boolean hasJoinGameRequest();
  /**
   * <code>.gravi.interview.JoinGameRequest joinGameRequest = 12;</code>
   * @return The joinGameRequest.
   */
  com.gravitysketch.interview.JoinGameRequest getJoinGameRequest();
  /**
   * <code>.gravi.interview.JoinGameRequest joinGameRequest = 12;</code>
   */
  com.gravitysketch.interview.JoinGameRequestOrBuilder getJoinGameRequestOrBuilder();

  /**
   * <code>.gravi.interview.TakePositionRequest takePositionRequest = 13;</code>
   * @return Whether the takePositionRequest field is set.
   */
  boolean hasTakePositionRequest();
  /**
   * <code>.gravi.interview.TakePositionRequest takePositionRequest = 13;</code>
   * @return The takePositionRequest.
   */
  com.gravitysketch.interview.TakePositionRequest getTakePositionRequest();
  /**
   * <code>.gravi.interview.TakePositionRequest takePositionRequest = 13;</code>
   */
  com.gravitysketch.interview.TakePositionRequestOrBuilder getTakePositionRequestOrBuilder();

  /**
   * <code>.gravi.interview.CheckGameResultRequest checkGameResultRequest = 14;</code>
   * @return Whether the checkGameResultRequest field is set.
   */
  boolean hasCheckGameResultRequest();
  /**
   * <code>.gravi.interview.CheckGameResultRequest checkGameResultRequest = 14;</code>
   * @return The checkGameResultRequest.
   */
  com.gravitysketch.interview.CheckGameResultRequest getCheckGameResultRequest();
  /**
   * <code>.gravi.interview.CheckGameResultRequest checkGameResultRequest = 14;</code>
   */
  com.gravitysketch.interview.CheckGameResultRequestOrBuilder getCheckGameResultRequestOrBuilder();
}
