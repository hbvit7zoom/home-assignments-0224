package ru.sberbank.jd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 % 5 - o2 % 5;
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.compare(15, 20));
        System.out.println(c.compare(1, 20));
        System.out.println(c.compare(20, 1));


        List<String> list = new ArrayList<>();

        list.add("11");
        list.add("1");
        list.add("22");
        list.add("111");

        System.out.println(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        System.out.println(list);
    }


    //  0  1  2   3   4
    //  15
    //  20
    //     1

    // [11, 1, 22, 111]
    // [111, 11, 22, 1]

    //

}
