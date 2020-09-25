package com.course.testng.MultiThreadOnAnnotion;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public  void test1(){
        System.out.println("thread1 id is "+Thread.currentThread().getId());
    }
    @Test
    public  void test2(){
        System.out.println("thread2 id is "+Thread.currentThread().getId());
    }
    @Test
    public  void test3(){
        System.out.println("thread3 id is "+Thread.currentThread().getId());
    }
}
