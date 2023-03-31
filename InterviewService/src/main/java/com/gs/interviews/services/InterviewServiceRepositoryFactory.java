package com.gs.interviews.services;

import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;
import com.gravitysketch.interview.RpcType;
import com.gs.interviews.InterviewServiceConfiguration;
import com.gs.interviews.controllers.InterviewController;
import com.gs.interviews.resources.RpcApiHandler;

import java.util.HashMap;
import java.util.Map;

public class InterviewServiceRepositoryFactory {

    public final RpcApiProcessor rpcApiProcessor;

    public InterviewServiceRepositoryFactory(InterviewServiceConfiguration config) {
        InterviewController controller = new InterviewController();

        Map<RpcType, RpcApiHandler> restHandlers = new HashMap<>();
        restHandlers.put(RpcType.HellowWorld, (RpcRequest request, RpcResponse.Builder responseBuilder) ->
                responseBuilder.setHellowWorldResponse(controller.helloWorld(request.getHelloWorldRequest())));
        restHandlers.put(RpcType.CreateGame, (RpcRequest request, RpcResponse.Builder responseBuilder) ->
                responseBuilder.setCreateGameResponse(controller.createGame(request.getCreateGameRequest())));
        rpcApiProcessor = new RpcApiProcessor(restHandlers);
    }

}
