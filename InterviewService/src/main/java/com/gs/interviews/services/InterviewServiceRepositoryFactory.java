package com.gs.interviews.services;

import com.gravitysketch.interview.*;
import com.gs.interviews.InterviewServiceConfiguration;
import com.gs.interviews.controllers.TicTacToeGameController;
import com.gs.interviews.resources.RpcApiHandler;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class InterviewServiceRepositoryFactory {

    public final RpcApiProcessor rpcApiProcessor;

    public InterviewServiceRepositoryFactory(InterviewServiceConfiguration config) {
        TicTacToeGameController controller = new TicTacToeGameController();

        Map<RpcType, RpcApiHandler> restHandlers = new HashMap<>();
        restHandlers.put(RpcType.HellowWorld, (RpcRequest request, RpcResponse.Builder responseBuilder) -> {
            HelloWorldRequest helloRequest = request.getHelloWorldRequest();

            String returnMsg;
            if (StringUtils.isEmpty(helloRequest.getGreatingMessage())) {
                returnMsg = "Sorry, what did you say?";
            } else {
                returnMsg = "Hello World!";
            }
            responseBuilder.setHellowWorldResponse(HellowWorldResponse.newBuilder().setReturnedMessage(returnMsg).build());
        });
        restHandlers.put(RpcType.CreateGame, (RpcRequest request, RpcResponse.Builder responseBuilder) ->
                responseBuilder.setCreateGameResponse(controller.createGame(request.getCreateGameRequest())));
        rpcApiProcessor = new RpcApiProcessor(restHandlers);
    }

}
