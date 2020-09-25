package com.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethods {
    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertEquals(1,1);
    }

    @Test
    public void logDemo() throws Exception {
        Reporter.log("这是测试日志");
        throw new Exception("这是测试异常");
    }
}
