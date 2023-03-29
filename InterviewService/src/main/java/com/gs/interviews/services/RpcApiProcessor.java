package com.gs.interviews.services;

import com.google.common.io.ByteStreams;
import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;
import com.gravitysketch.interview.RpcStatus;
import com.gravitysketch.interview.RpcType;
import com.gs.interviews.resources.RpcApiHandler;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class RpcApiProcessor {

    private final Map<RpcType, RpcApiHandler> authHandlers;

    public RpcApiProcessor(Map<RpcType, RpcApiHandler> handlers) {
        this.authHandlers = handlers;
    }

    public Response process(InputStream in) {
        RpcResponse.Builder responseBuilder = RpcResponse.newBuilder();
        try {
            RpcRequest restRequest = RpcRequest.parseFrom(ByteStreams.toByteArray(in));
            process(restRequest, responseBuilder);
        } catch (IOException ex) {
            responseBuilder.setStatus(RpcStatus.UnknownStatus);
        }
        return Response.ok(responseBuilder.build().toByteArray()).header("Cache-Control", "No-Store").build();
    }

    private void process(RpcRequest restRequest, RpcResponse.Builder responseBuilder) {
        try {
            RpcApiHandler handler = authHandlers.get(restRequest.getRpcType());
            if (handler == null) {
                responseBuilder.setStatus(RpcStatus.UnknownStatus);
                return;
            }
            handler.process(restRequest, responseBuilder);
        } catch (Exception ex){
            responseBuilder.setStatus(RpcStatus.UnknownStatus);
        }
    }
}
