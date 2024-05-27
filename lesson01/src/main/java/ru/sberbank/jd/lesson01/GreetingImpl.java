package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Реализация интерфейса Greeting.
 */
public class GreetingImpl implements Greeting {

    /**
     * Возвращает имя.
     */
    @Override
    public String getFirstName() {
        return "Dmitry";
    }

    /**
     * Возвращает фамилию.
     */
    @Override
    public String getLastName() {
        return "Kharitonov";
    }

    /**
     * Возвращает год рождения.
     */
    @Override
    public int getBirthYear() {
        return 1992;
    }

    /**
     * Возвращает ссылку на репозиторий.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/BilboBagginsBR";
    }

    /**
     * Возвращает номер телефона.
     */
    @Override
    public String getPhone() {
        return "8906*****21";
    }

    /**
     * Возвращает коллекцию увлечений.
     */
    @Override
    public Collection<String> getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Java");
        hobbies.add("Books");
        hobbies.add("Sport");

        return hobbies;
    }

    /**
     * Возвращает коллекцию ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        List<String> courseExpectations = new ArrayList<>();
        courseExpectations.add("Java knowledge and skills");
        courseExpectations.add("FUN");

        return courseExpectations;
    }
}
