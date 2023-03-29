package com.gs.interviews.controllers;

import com.gravitysketch.interview.CreateGameRequest;
import com.gravitysketch.interview.CreateGameResponse;

public class TicTacToeGameController {

    public CreateGameResponse createGame(CreateGameRequest req) {
        return CreateGameResponse.newBuilder().build();
    }
}
