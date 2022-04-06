package com.example.demo.windy;

import com.google.gson.Gson;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class WindyApiEndpoint implements APIEndpoint {

    @Override
    public CloseableHttpResponse getAPIResponse(Object pojo) throws IOException {
        String       postUrl       = "https://api.windy.com/api/point-forecast/v2";// put in your url
        Gson gson                  = new Gson();
        HttpClient   httpClient    = HttpClientBuilder.create().build();
        HttpPost     post          = new HttpPost(postUrl);
        StringEntity postingString = new StringEntity(gson.toJson(pojo));//gson.tojson() converts your pojo to json
        System.out.println(EntityUtils.toString(postingString));
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        return (CloseableHttpResponse) httpClient.execute(post);
    }
}
