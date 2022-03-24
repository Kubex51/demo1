package com.example.demo;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.IOException;
import java.util.List;

public interface APIEndpoint {
    CloseableHttpResponse getAPIResponse(Object pojo) throws IOException;
}
