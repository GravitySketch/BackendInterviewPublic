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
        final var createGameRes = createGame(CreateGameRequest
                .newBuilder()
                .setUserId(USER_1)
                .build());

        Assert.assertEquals(createGameRes.getGameId(), "");

        final var joinGameRes = joinGame(JoinGameRequest
                .newBuilder()
                .setUserId(USER_1)
                .setGameId(createGameRes.getGameId())
                .build());

        // TODO add more steps to test playing the game
    }

    private CreateGameResponse createGame(CreateGameRequest req) throws Exception {
        return mustSend(RpcRequest.newBuilder()
                .setCreateGameRequest(req)
                .build()).getCreateGameResponse();
    }

    private JoinGameResponse joinGame(JoinGameRequest req) throws Exception {
        return mustSend(RpcRequest.newBuilder()
                .setJoinGameRequest(req)
                .build()).getJoinGameResponse();
    }

    private RpcResponse mustSend(RpcRequest req) throws Exception {
        final var res = rpcRequestUtil.sendRequest(req);

        Assert.assertEquals(res.getStatus(), RpcStatus.NoError);
        return res;
    }

}
