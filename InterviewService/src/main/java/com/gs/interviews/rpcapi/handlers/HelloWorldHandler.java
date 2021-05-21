package com.gs.interviews.rpcapi.handlers;

import com.gravitysketch.interview.HelloWorldRequest;
import com.gravitysketch.interview.HellowWorldResponse;
import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;
import org.apache.commons.lang3.StringUtils;

public class HelloWorldHandler implements RpcApiHandler{
    @Override
    public void process(RpcRequest request, RpcResponse.Builder responseBuilder) {
        HelloWorldRequest helloRequest = request.getHelloWorldRequest();

        String returnMsg;
        if (StringUtils.isEmpty(helloRequest.getGreatingMessage())){
            returnMsg = "Sorry, what did you say?";
        }else {
            returnMsg = "Hello World!";
        }
        responseBuilder.setHellowWorldResponse(HellowWorldResponse.newBuilder().setReturnedMessage(returnMsg).build());
    }
}
