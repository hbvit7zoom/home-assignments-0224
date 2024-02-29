package org.example;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

    @Test
    public void simpleTest1() {
        Divider divider = new Divider();
        Assert.assertEquals(2, divider.divide(10, 5));
    }

    @Test
    public void simpleTest2() {
        Divider divider = new Divider();
        Assert.assertEquals(1, divider.divide(10, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void simpleTest3() {
        Divider divider = new Divider();
        divider.divide(10, 0);
    }
}