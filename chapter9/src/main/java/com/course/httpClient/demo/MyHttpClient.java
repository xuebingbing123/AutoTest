package com.course.httpClient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        String result ;
        HttpGet get = new HttpGet("https://www.baidu.com");
        HttpClient client = new DefaultHttpClient();
        HttpResponse res =client.execute(get);
        result = EntityUtils.toString(res.getEntity(),"utf-8");
        System.out.println(result);
    }


}
