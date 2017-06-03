package com.zhch.demo10;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
public class Demo10SpringContextTest extends AbstractTestNGSpringContextTests{

    @Test
    public void test01(){
        Assert.assertEquals(1, 1);
    }

}
