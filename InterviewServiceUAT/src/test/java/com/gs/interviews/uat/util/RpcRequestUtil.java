package com.gs.interviews.uat.util;

import com.gravitysketch.interview.RpcRequest;
import com.gravitysketch.interview.RpcResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class RpcRequestUtil {

    public final static String RPC_API_URL = "http://localhost:20998/api/process";

    private SocketConfig socketConfig;
    private RequestConfig requestConfig;

    public RpcRequestUtil() {
        socketConfig = SocketConfig.copy(SocketConfig.DEFAULT).setSoTimeout(3).build();
        requestConfig = RequestConfig.copy(RequestConfig.DEFAULT)
                .setConnectionRequestTimeout(0)
                .setConnectTimeout(0)
                .setSocketTimeout(0)
                .build();
    }

    public RpcResponse sendRequest(RpcRequest request) throws Exception {
        CloseableHttpClient httpclient = this.createClient(socketConfig, requestConfig);
        HttpPost httppost = new HttpPost(String.format(RPC_API_URL));
        httppost.setEntity(EntityBuilder.create().setBinary(request.toByteArray()).build());
        CloseableHttpResponse response = httpclient.execute(httppost);
        try {
            return RpcResponse.parseFrom(response.getEntity().getContent());
        } finally {
            this.closeResponse(response);
        }
    }

    private CloseableHttpClient createClient(SocketConfig socketConfig, RequestConfig requestConfig){
        return HttpClientBuilder.create().setDefaultSocketConfig(socketConfig).setDefaultRequestConfig(requestConfig).build();
    }

    private void closeResponse(CloseableHttpResponse response){
        if (response != null) {
            try {
                response.close();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
