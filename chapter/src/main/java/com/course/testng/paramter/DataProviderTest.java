package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "prov")
    public void provTest1(String name, int age){
        System.out.println("paramTest1:name = "+name +";age = "+age);
    }
    @DataProvider(name = "prov")
    public Object[][] provData(){
        Object[][] o = new Object[][]{
                {"zhang",19},
                {"li",20},
                {"wang",21}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1:name = "+name +";age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2:name = "+name +";age = "+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] obj = null;
        if(method.getName().equals("test1")){
            obj = new Object[][]{
                    {"zhang1",19},
                    {"li1",20},
            };
        }else if (method.getName().equals("test2")){
            obj = new Object[][]{
                    {"zhang2",19},
                    {"li2",20},
            };
        }
        return obj;
    }
}
