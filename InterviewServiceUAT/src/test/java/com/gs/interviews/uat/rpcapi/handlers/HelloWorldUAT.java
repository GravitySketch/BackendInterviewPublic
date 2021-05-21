package com.gs.interviews.uat.rpcapi.handlers;

import com.gravitysketch.interview.*;
import com.gs.interviews.uat.InterviewServiceUAT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorldUAT extends InterviewServiceUAT {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldUAT.class);

    @BeforeMethod(groups = {"interview-service"})
    public void setup() {
    }


    @Test(groups = {"interview-service"})
    public void testHelloWorldEmpty() throws Exception {
        HelloWorldRequest helloRequest = HelloWorldRequest.newBuilder().build();
        RpcRequest rpcRequest = RpcRequest.newBuilder().setHelloWorldRequest(helloRequest).build();
        RpcResponse rpcResponse = rpcRequestUtil.sendRequest(rpcRequest);

        Assert.assertEquals(rpcResponse.getStatus(), RpcStatus.NoError);
        Assert.assertEquals(rpcResponse.getHellowWorldResponse().getReturnedMessage(), "Sorry, what did you say?");
    }

    @Test(groups = {"interview-service"})
    public void testHelloWorldSaySomething() throws Exception {
        HelloWorldRequest helloRequest = HelloWorldRequest.newBuilder().setGreatingMessage("greeting").build();
        RpcRequest rpcRequest = RpcRequest.newBuilder().setRpcType(RpcType.HellowWorld).setHelloWorldRequest(helloRequest).build();
        RpcResponse rpcResponse = rpcRequestUtil.sendRequest(rpcRequest);

        Assert.assertEquals(rpcResponse.getStatus(), RpcStatus.NoError);
        Assert.assertEquals(rpcResponse.getHellowWorldResponse().getReturnedMessage(), "Hello World!");
    }
}
