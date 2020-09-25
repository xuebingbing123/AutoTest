package com.course.testng;

import org.testng.*;
import org.testng.annotations.Test;

public class exception {
    /**
     * 在我们期望结果为某一个异常的时候
     */
//    @Test(expectedExceptions = RuntimeException.class)
//    public void RunTimeExceptionFailed(){
//        System.out.println("这是一个失败的异常测试");
//    }
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionSuccess(){
        System.out.println("这是一个失败的异常测试");
        throw new RuntimeException();
    }

}
