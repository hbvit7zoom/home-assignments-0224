package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Имплементация интерфейса Greeting
 */

public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     */

    public String getFirstName() {
        return "Анатолий";
    }

    /**
     * Получение фамилии.
     */

    public String getLastName() {
        return "Сорокко";
    }

    /**
     * Получение года рождения.
     */

    public int getBirthYear() {
        return 1996;
    }

    /**
     * Получение набора хобби.
     */

    public Collection<String> getHobbies() {
        Collection<String> hobbies = new ArrayList<>();
        hobbies.add("Gym");
        hobbies.add("Traveling");
        hobbies.add("TableTennis");

        return hobbies;
    }

    /**
     * Получение имени репозитория.
     */

    public String getRepoUrl() {
        return "https://github.com/hbvit7zoom/home-assignments-0224";
    }

    /**
     * Получение телефона.
     */

    public String getPhone() {
        return "89992194996";
    }

    /**
     * Получение набора ожиданий от курса.
     */

    public Collection<String> getCourseExpectations() {
        Collection<String> courseExpectations = new ArrayList<>();
        courseExpectations.add("Improve my programming skills");

        return courseExpectations;
    }
}
