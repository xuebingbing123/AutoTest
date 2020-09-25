package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite执行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite执行");
    }
}
