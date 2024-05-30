package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

public class GreetingImplTest {
    GreetingImpl greetingImpl = new GreetingImpl();

    @Test
    public void getFirstName(){
        Assert.assertEquals("Имя не совпадает с ожидаемым, актуальное имя: " + greetingImpl.getFirstName(),  "Анатолий", greetingImpl.getFirstName());
    }

    @Test
    public void getLastName(){
        Assert.assertEquals("Фамилия не совпадает с ожидаемой, актуальная фамилия: " + greetingImpl.getLastName(), "Сорокко", greetingImpl.getLastName());
    }

    @Test
    public void getBirthYear(){
        Assert.assertEquals("Год рождения не совпадает с ожидаемым, актуальный год рождения: " + greetingImpl.getBirthYear(), 1996, greetingImpl.getBirthYear());
    }

    @Test
    public void getHobbies(){
        Assert.assertTrue("Актуальный список хобби отличается от ожидаемого", greetingImpl.getHobbies().contains("Gym"));
        Assert.assertTrue("Актуальный список хобби отличается от ожидаемого", greetingImpl.getHobbies().contains("Traveling"));
        Assert.assertTrue("Актуальный список хобби отличается от ожидаемого", greetingImpl.getHobbies().contains("TableTennis"));
    }

    @Test
    public void getRepoUrl(){
        Assert.assertEquals("Ссылка на репозиторий отличается от ожидаемой: " + greetingImpl.getRepoUrl(),"https://github.com/hbvit7zoom/home-assignments-0224", greetingImpl.getRepoUrl());
    }

    @Test
    public void getPhone(){
        Assert.assertEquals("Номер телефона отличается от ожидаемого: " + greetingImpl.getPhone(),"89992194996", greetingImpl.getPhone());
    }

    @Test
    public void getCourseExpectations(){
        Assert.assertTrue("Список ожидание не соответствует ожидаемому", greetingImpl.getCourseExpectations().contains("Improve my programming skills"));
    }
}
