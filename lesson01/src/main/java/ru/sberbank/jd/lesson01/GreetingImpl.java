package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Имплементация интерфейса Greeting.
 */

public class GreetingImpl implements Greeting {

    public String getFirstName() {
        String firstName = "Алексей";
        return firstName;
    }

    public String getLastName() {
        String lastName = "Попов";
        return lastName;
    }

    public int getBirthYear() {
        int birthYear = 1998;
        return birthYear;
    }

    /**
     * Тест коллекци Хобби.
     */

    public Collection<String> getHobbies() {
        Collection<String> hobbies = new ArrayList();
        hobbies.add("ComputerGames");
        hobbies.add("Bicycle");
        hobbies.add("Cars");
        hobbies.add("Comics");
        return hobbies;
    }

    public String getRepoUrl() {
        String repoUrl = "https://github.com/risevetrov/home-assignments-0224.git";
        return repoUrl;
    }

    public String getPhone() {
        String phone = "+79920257991";
        return phone;
    }

    /**
     * Тест коллекци Ожидания от курса.
     */

    public Collection<String> getCourseExpectations() {
        Collection<String> courseExpectations = new ArrayList();
        courseExpectations.add("Get grate Java Skills");
        return courseExpectations;
    }
}
