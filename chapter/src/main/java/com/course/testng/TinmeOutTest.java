package com.course.testng;

import org.testng.annotations.Test;

public class TinmeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFail() throws InterruptedException{
        Thread.sleep(3000);
    }
}
