package ru.sberbank.jd.exception;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int i = Integer.parseInt(arg);
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}