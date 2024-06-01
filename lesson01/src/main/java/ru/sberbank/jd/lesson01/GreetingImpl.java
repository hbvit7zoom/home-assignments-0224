package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Returns all my data.
 */
public class GreetingImpl implements Greeting {

    /**
     * Gets first name.
     *
     * @return first name
     */
    @Override
    public String getFirstName() {
        return "Самая";
    }

    /**
     * Gets last name.
     *
     * @return last name
     */
    @Override
    public String getLastName() {
        return "Асадуллаева";
    }

    /**
     * Gets birth year.
     *
     * @return birth year
     */
    @Override
    public int getBirthYear() {
        return 2001;
    }

    /**
     * Gets hobby.
     *
     * @return hobby list
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of("swimming", "walking");
    }

    /**
     * Gets repo url.
     *
     * @return repo url
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/SamayaA/homework_java.git";
    }

    /**
     * Displays where you can find number.
     *
     * @return phone number
     */
    @Override
    public String getPhone() {
        return "look in Друг";
    }

    /**
     * Gets expectations.
     *
     * @return course expectations
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Create Spring Project");
    }
}
