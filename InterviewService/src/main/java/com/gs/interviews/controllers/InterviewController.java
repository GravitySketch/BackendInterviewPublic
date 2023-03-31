package com.gs.interviews.controllers;

import com.gravitysketch.interview.CreateGameRequest;
import com.gravitysketch.interview.CreateGameResponse;
import com.gravitysketch.interview.HelloWorldRequest;
import com.gravitysketch.interview.HellowWorldResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterviewController {
    private static final Logger logger = LoggerFactory.getLogger(InterviewController.class);

    public HellowWorldResponse helloWorld(HelloWorldRequest req) {
        String returnMsg;
        if (StringUtils.isEmpty(req.getGreatingMessage())) {
            returnMsg = "Sorry, what did you say?";
        } else {
            returnMsg = "Hello World!";
        }
        
        return HellowWorldResponse.newBuilder().setReturnedMessage(returnMsg).build();
    }

    public CreateGameResponse createGame(CreateGameRequest req) {
        return CreateGameResponse.newBuilder().build();
    }
}
