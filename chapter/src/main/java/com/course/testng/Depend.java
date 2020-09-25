package com.course.testng;

import org.testng.annotations.Test;

public class Depend {
    @Test
    public  void test1(){
        System.out.println("这是测试方法1");
//        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public  void test2(){
        System.out.println("这是测试方法2");
    }
}
