package com.gs.interviews.rpcapi.handlers;

import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;

public interface RpcApiHandler {
    void process(RpcRequest request, RpcResponse.Builder responseBuilder);
}
