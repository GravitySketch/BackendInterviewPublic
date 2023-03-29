package com.gs.interviews.resources;

import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;

@FunctionalInterface
public interface RpcApiHandler {
    void process(RpcRequest request, RpcResponse.Builder responseBuilder);
}
