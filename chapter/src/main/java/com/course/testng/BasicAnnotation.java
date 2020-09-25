package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
     @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void  AfterMethod(){
        System.out.println("AfterMethod这是在测试方法之后执行的");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在类执行之前执行的");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在类执行之后执行的");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite这是在测试套件执行之前执行的");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite这是在测试套件执行之后执行的");
    }

}