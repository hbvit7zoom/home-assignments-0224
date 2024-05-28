package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест класс NodImpl.
 */

public class NodImplTest {

    /**
     * Тест вычисления НОД.
     */

    @Test
    public void calculate() {
        NodImpl nodImpl = new NodImpl();
        Assert.assertEquals("NodImplResult ", nodImpl.calculate(100, 52), 4);
        Assert.assertEquals("NodImplResult ", nodImpl.calculate(100, 42), 2);
    }
}