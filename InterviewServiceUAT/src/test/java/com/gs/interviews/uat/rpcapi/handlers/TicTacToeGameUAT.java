package com.gs.interviews.uat.rpcapi.handlers;

import com.gravitysketch.interview.*;
import com.gs.interviews.uat.InterviewServiceUAT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TicTacToeGameUAT extends InterviewServiceUAT {
    private static final Logger logger = LoggerFactory.getLogger(TicTacToeGameUAT.class);

    private static final String USER_1 = "user_1";

    private static final String USER_2 = "user_2";

    @BeforeMethod(groups = {"interview-service"})
    public void setup() {
    }

    @Test(groups = {"interview-service"})
    public void testPlayTheGame() throws Exception {
        final var createGameRes = mustSend(RpcRequest.newBuilder()
                .setCreateGameRequest(
                        CreateGameRequest
                                .newBuilder()
                                .setUserId(USER_1)
                                .build()
                ).build()).getCreateGameResponse();

        final var joinGameRes = mustSend(RpcRequest.newBuilder()
                .setJoinGameRequest(
                        JoinGameRequest
                                .newBuilder()
                                .setUserId(USER_1)
                                .setGameId(createGameRes.getGameId())
                                .build()
                ).build());

        // TODO add more steps to test playing the game
    }

    private RpcResponse mustSend(RpcRequest req) throws Exception {
        final var res = rpcRequestUtil.sendRequest(req);

        Assert.assertEquals(res.getStatus(), RpcStatus.NoError);
        return res;
    }

}
