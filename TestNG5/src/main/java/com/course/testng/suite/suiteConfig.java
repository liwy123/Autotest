package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite执行ok了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite执行ok了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest测试方法执行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest测试方法执行了");
    }
}
