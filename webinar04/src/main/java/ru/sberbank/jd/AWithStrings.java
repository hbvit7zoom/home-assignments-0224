package ru.sberbank.jd;

public class AWithStrings {

    public static void main(String[] args) {
//        String s1 = "123";
//        String s2 = "123";
        String s1 = new String("123");
        String s2 = new String("123");

        if (s1 == s2) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
