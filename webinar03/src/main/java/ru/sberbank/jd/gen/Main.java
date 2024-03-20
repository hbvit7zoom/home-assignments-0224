package ru.sberbank.jd.gen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("123");
        list.add(123);
        list.add(123L);
        list.add(0.001);

        System.out.println(list);
        System.out.println("====");

        for (Object o : list) {
            if (o instanceof String) {
                System.out.println(o + "123");
            }
            if (o instanceof Integer) {
                System.out.println((Integer) o + 123);
            }
        }

    }
}
