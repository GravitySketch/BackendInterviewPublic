package com.gs.interviews.services;

import com.gravitysketch.interview.RpcType;
import com.gs.interviews.InterviewServiceConfiguration;
import com.gs.interviews.rpcapi.handlers.*;

import java.util.HashMap;
import java.util.Map;

public class InterviewServiceRepositoryFactory {

    public final RpcApiProcessor rpcApiProcessor;

    public InterviewServiceRepositoryFactory(InterviewServiceConfiguration config) {
        Map<RpcType, RpcApiHandler> restHandlers = new HashMap<>();
        restHandlers.put(RpcType.HellowWorld, new HelloWorldHandler());
        rpcApiProcessor = new RpcApiProcessor(restHandlers);
    }

}
