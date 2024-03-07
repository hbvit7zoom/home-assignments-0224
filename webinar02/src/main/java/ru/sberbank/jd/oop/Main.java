package ru.sberbank.jd.oop;

public class Main {

    public static void main(String[] args) {
        Summator summator = new Summator();
        Multiplier multiplier = new Multiplier();
        System.out.println(summator.make(2, 3));
        System.out.println(multiplier.make(2, 3));

        Operator summator1 = new Summator();
        Operator multiplier1 = new Multiplier();
        System.out.println(summator1.make(2, 3));
        System.out.println(multiplier1.make(2, 3));
    }
}
