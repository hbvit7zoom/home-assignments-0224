package ru.sberbank.jd;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class B {

    private int i;
    private String s;

    public B(int i, String s) {
        this.i = i;
        this.s = s;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        B b = (B) o;
//
//        if (i != b.i) return false;
//        return Objects.equals(s, b.s);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = i;
//        result = 31 * result + (s != null ? s.hashCode() : 0);
//        return result;
////        return 5;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B b = (B) o;

        return i == b.i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        B b1 = new B(5, "6");
        B b2 = new B(5, "6");
//        B b3 = new B(1, "6");
        B b3 = new B(5, "3");

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());

        Map<B, String> map = new HashMap<>();

        map.put(b1, "b1");
        map.put(b2, "b2");
        map.put(b3, "b3");

        System.out.println(map);
    }
}
