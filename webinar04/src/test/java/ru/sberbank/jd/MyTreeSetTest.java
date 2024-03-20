package ru.sberbank.jd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class MyTreeSetTest {


    @Test
    public void testCreate() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
    }

    @Test
    public void testAddOne() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertEquals(1, set.size());

    }

    @Test
    public void testAddTwo() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(3));
        Assert.assertEquals(2, set.size());
    }


    //              5
    //            3   10

    @Test
    public void testAddTwo1() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(10));
        Assert.assertEquals(2, set.size());
    }


    @Test
    public void testAddSeveral() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.add(-5));
        Assert.assertTrue(set.add(2));
        Assert.assertTrue(set.add(8));
        Assert.assertTrue(set.add(12));
        Assert.assertEquals(7, set.size());
    }

    @Test
    public void testRemoveElementIsNotInSet() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertFalse(set.remove(5));
    }

    @Test
    public void testRemoveOneRoot() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(0, set.size());
    }

    @Test
    public void testRemoveRootWithLeft() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(1, set.size());
    }

    @Test
    public void testRemoveRootWithRight() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(1, set.size());
    }

    @Test
    public void testRemoveRootWithBoth() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(2, set.size());
    }

    //                 5
    //            0        10

    //                 0
    //                    10


    @Test
    public void testRemoveRootWithLeftWithLeftChild() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.add(-2));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(3, set.size());
    }
    //                 5
    //            0        10
    //         -2

    //                 0
    //             -2       10

    @Test
    public void testRemoveRootWithLeftWithBothChild() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.add(-2));
        Assert.assertTrue(set.add(2));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(4, set.size());
    }
    //                 5
    //            0        10
    //         -2    2

    //                 2
    //            0         10
    //         -2

    //                     5
    //            0            10
    //         -2    2
    //              1   4

    //                     4
    //            0            10
    //         -2    2
    //              1

    @Test
    public void testRemoveRoot() {
        MyTreeSet<Integer> set = new MyTreeSet<>(Integer::compareTo);
        Assert.assertTrue(set.add(5));
        Assert.assertTrue(set.add(0));
        Assert.assertTrue(set.add(10));
        Assert.assertTrue(set.add(-5));
        Assert.assertTrue(set.add(2));
        Assert.assertTrue(set.add(8));
        Assert.assertTrue(set.add(12));
        Assert.assertTrue(set.remove(5));
        Assert.assertEquals(7, set.size());
    }

    //                 5
    //            0        10
    //         -5    2    8    12


    //                 2
    //            0        10
    //         -5        8    12

}