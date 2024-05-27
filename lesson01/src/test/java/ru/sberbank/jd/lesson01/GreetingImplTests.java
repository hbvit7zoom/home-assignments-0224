package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTests {
    static GreetingImpl greeting = new GreetingImpl();

    @Test
    public void getFirstNameTest() {
        Assert.assertEquals("Dmitry", greeting.getFirstName());
    }

    @Test
    public void getLastNameTest() {
        Assert.assertEquals("Kharitonov", greeting.getLastName());
    }

    @Test
    public void getPhoneNumberTest() {
        Assert.assertEquals("8906*****21", greeting.getPhone());
    }

    @Test
    public void getBirthYearTest() {
        Assert.assertEquals(1992, greeting.getBirthYear());
    }

    @Test
    public void getRepoUrlTest() {
        Assert.assertEquals("https://github.com/BilboBagginsBR", greeting.getRepoUrl());
    }

    @Test
    public void getHobbiesTest() {
        Assert.assertEquals(3, greeting.getHobbies().size());
        Assert.assertFalse(greeting.getHobbies().isEmpty());
    }
    @Test
    public void getCourseExpectationsTest() {
        Assert.assertEquals(2, greeting.getCourseExpectations().size());
        Assert.assertFalse(greeting.getHobbies().isEmpty());
    }


}
