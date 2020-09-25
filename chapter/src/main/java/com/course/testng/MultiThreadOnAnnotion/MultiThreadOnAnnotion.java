package com.course.testng.MultiThreadOnAnnotion;
import org.testng.annotations.Test;
public class MultiThreadOnAnnotion {
    /**
     * invocationCount----表示执行的次数
     *
     * threadPoolSize-----表示线程池的内线程的个数
     *
     * timeOut-------超时时间-毫秒
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
