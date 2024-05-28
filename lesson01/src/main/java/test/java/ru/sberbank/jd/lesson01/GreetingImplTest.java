package test.java.ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson01.GreetingImpl;

/**
 * Тестирование класса  GreetingImpl.
 */

public class GreetingImplTest {

    GreetingImpl greetingImp = new GreetingImpl();

    @Test
    public void getFirstName() {
        Assert.assertEquals("FirstName ", greetingImp.getFirstName(), "Алексей");
    }

    @Test
    public void getLastName() {
        Assert.assertEquals("LastName ", greetingImp.getLastName(), "Попов");
    }

    @Test
    public void getBirthYear() {
        Assert.assertEquals("BirthYear ", greetingImp.getBirthYear(), 1998);
    }

    @Test
    public void getHobbies() {
        System.out.println(this.greetingImp.getHobbies());
        Assert.assertTrue("Hobbies ", greetingImp.getHobbies().contains("ComputerGames"));
        Assert.assertTrue("Hobbies ", greetingImp.getHobbies().contains("Bicycle"));
        Assert.assertTrue("Hobbies ", greetingImp.getHobbies().contains("Cars"));
        Assert.assertTrue("Hobbies ", greetingImp.getHobbies().contains("Comics"));
    }

    @Test
    public void getRepoUrl() {
        Assert.assertEquals("RepoUrl ", greetingImp.getRepoUrl(), "https://github.com/risevetrov/home-assignments-0224.git");
    }

    @Test
    public void getPhone() {
        Assert.assertEquals("Phone ", greetingImp.getPhone(), "+79920257991");
    }

    @Test
    public void getCourseExpectations() {
        Assert.assertTrue(greetingImp.getCourseExpectations().contains("Get grate Java Skills"));
    }
}
