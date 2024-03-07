package ru.sberbank.jd.oop;

public class Multiplier implements Operator {
    @Override
    public int make(int a, int b) {
        return a * b;
    }
}
