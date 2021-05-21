package com.gs.interviews.resources;


import com.gs.interviews.services.RpcApiProcessor;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;

@Path("/api")
public class RpcApiResource {
    private final RpcApiProcessor processor;

    public RpcApiResource(RpcApiProcessor processor) {
        this.processor = processor;
    }

    @POST
    @Path("/process")
    @Consumes({MediaType.APPLICATION_OCTET_STREAM})
    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response rpcApiProcess(InputStream in){
        return processor.process(in);
    }
}
