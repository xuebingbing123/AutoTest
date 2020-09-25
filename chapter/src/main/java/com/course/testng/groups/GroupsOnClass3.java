package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3{
    public void tea1(){
        System.out.println("GroupsOnClass3中tea1执行");
    }
}
