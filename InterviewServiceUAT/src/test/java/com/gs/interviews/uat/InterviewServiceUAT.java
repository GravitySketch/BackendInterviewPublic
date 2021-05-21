package com.gs.interviews.uat;

import com.gs.interviews.uat.util.RpcRequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class InterviewServiceUAT {
    private static final Logger logger = LoggerFactory.getLogger(InterviewServiceUAT.class);
    private InterviewServiceTestServer testServer = new InterviewServiceTestServer();
    protected final RpcRequestUtil rpcRequestUtil = new RpcRequestUtil();

    @BeforeGroups(groups = {"interview-service"})
    public void beforeGroups() {
        testServer.beforeTest();
        logger.debug("test server is started");
    }

    @AfterGroups(groups = {"interview-service"})
    public void afterGroups() {
        testServer.afterTest();
        logger.debug("test server is stopped");
    }
}
