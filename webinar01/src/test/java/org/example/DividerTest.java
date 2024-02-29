package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DividerTest {
    Divider divider;

    @Before
    public void init() {
        System.out.println("Before test");
        divider = new Divider();
    }

    @Test
    public void simpleTest1() {
        Assert.assertEquals(2, divider.divide(10, 5));
    }

    @Test
    public void simpleTest2() {
        Assert.assertEquals(1, divider.divide(10, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void simpleTest3() {
        divider.divide(10, 0);
    }
}