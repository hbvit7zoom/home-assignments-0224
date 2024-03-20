package ru.sberbank.jd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomListImplTest {

    CustomListImpl<Integer> list = new CustomListImpl<>();

    @Test
    public void add0() {
        assertEquals("", list.toString());
    }

    @Test
    public void add1() {
        assertTrue(list.add(1));
        assertEquals("1 ", list.toString());
    }

    @Test
    public void add2() {
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertEquals("1 2 ", list.toString());
    }

    @Test
    public void add3() {
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertTrue(list.add(3));
        assertEquals("1 2 3 ", list.toString());
    }

    @Test
    public void size3() {
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertTrue(list.add(3));
        assertEquals(3, list.size());
    }

}