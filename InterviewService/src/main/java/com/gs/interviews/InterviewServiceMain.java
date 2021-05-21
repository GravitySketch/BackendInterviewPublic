package com.gs.interviews;

import com.gs.interviews.resources.RpcApiResource;
import com.gs.interviews.services.InterviewServiceRepositoryFactory;
import io.dropwizard.Application;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class InterviewServiceMain extends Application<InterviewServiceConfiguration> {

    private InterviewServiceRepositoryFactory repositoryFactory;

    public static void main(String[] args) throws Exception {
        new InterviewServiceMain().run(args);
    }

    @Override
    public void initialize(Bootstrap<InterviewServiceConfiguration> bootstrap) {
        bootstrap.addBundle(new MultiPartBundle());
    }

    @Override
    public void run(InterviewServiceConfiguration configuration, Environment environment) {
        repositoryFactory = new InterviewServiceRepositoryFactory(configuration);
        environment.jersey().register(new RpcApiResource(repositoryFactory.rpcApiProcessor));
    }

    public InterviewServiceRepositoryFactory getRepositoryFactory() {
        return repositoryFactory;
    }

}