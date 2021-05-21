package com.gs.interviews.uat;

import com.gs.interviews.InterviewServiceConfiguration;
import com.gs.interviews.InterviewServiceMain;
import com.gs.interviews.services.InterviewServiceRepositoryFactory;
import io.dropwizard.testing.DropwizardTestSupport;
import io.dropwizard.testing.ResourceHelpers;

public class InterviewServiceTestServer {
    private DropwizardTestSupport<InterviewServiceConfiguration> server = null;

    public InterviewServiceRepositoryFactory getRepositoryFactory() {
        return ((InterviewServiceMain)server.getApplication()).getRepositoryFactory();
    }

    public void beforeTest() {
        if (server == null) {
            server = new DropwizardTestSupport(InterviewServiceMain.class, ResourceHelpers.resourceFilePath("interviewservice-uat.yml"));
            server.before();
        }
    }

    public void afterTest() {
        if (server != null) {
            server.after();
            server = null;
        }
    }
}
