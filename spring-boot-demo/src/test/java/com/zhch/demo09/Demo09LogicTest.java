package com.zhch.demo09;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo09LogicTest {

    Demo09Logic logic;

    @BeforeClass
    public void init(){
        logic = new Demo09Logic();
    }

    @Test
    public void add(){
        int sum = logic.add(1, 2);
        Assert.assertEquals(3, sum);
    }
}
