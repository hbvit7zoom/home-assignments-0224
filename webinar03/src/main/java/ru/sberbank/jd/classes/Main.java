package ru.sberbank.jd.classes;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        A a = b.createA();

        D d = new D();
        C c = d.createC();

        E.F f = new E.F();
        E e = f.createE();

        E e1 = new E();
        E.H h = e1.new H();

        Predicate<String> pr = new Predicate<>() {
            @Override
            public boolean test(String str) {
                return str.startsWith("A");
            }
        };

        boolean abc = pr.test("Abc");

        System.out.println(abc);
        System.out.println("Abc".startsWith("A"));
    }

}