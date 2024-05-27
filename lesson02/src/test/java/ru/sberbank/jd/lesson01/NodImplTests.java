package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.NodImpl;

public class NodImplTests {
    static NodImpl nodImpl = new NodImpl();

    @Test
    public void calculateTest() {
        Assert.assertEquals(1, nodImpl.calculate(4, 5));
        Assert.assertEquals(6, nodImpl.calculate(12, 6));
        Assert.assertEquals(13, nodImpl.calculate(13, 13));
    }
}
