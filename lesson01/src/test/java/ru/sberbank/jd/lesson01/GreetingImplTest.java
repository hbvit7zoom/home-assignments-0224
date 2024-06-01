package ru.sberbank.jd.lesson01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreetingImplTest {

    private GreetingImpl greeting;

    @BeforeEach
    void setUp() {
        this.greeting = new GreetingImpl();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals(greeting.getFirstName(), "Самая");
    }

    @Test
    void getLastName() {
        Assertions.assertEquals(greeting.getLastName(), "Асадуллаева");
    }

    @Test

    void getBirthYear() {
        Assertions.assertEquals(greeting.getBirthYear(), 2001);
    }
    @Test
    void getHobbies() {
        ArrayList<String> resultHobbies = new ArrayList<>();
        resultHobbies.add("swimming");
        resultHobbies.add("walking");
        Assertions.assertEquals(greeting.getHobbies(), resultHobbies);
    }

    @Test
    void getRepoUrl() {

        Assertions.assertEquals(greeting.getRepoUrl(), "https://github.com/SamayaA/homework_java.git");
    }

    @Test
    void getPhone() {
        Assertions.assertEquals(greeting.getPhone(), "look in Друг");
    }

    @Test
    void getCourseExpectations() {
        ArrayList<String> resultExpectation = new ArrayList<>();
        resultExpectation.add("Create Spring Project");
        Assertions.assertEquals(greeting.getCourseExpectations(), resultExpectation);
    }
}