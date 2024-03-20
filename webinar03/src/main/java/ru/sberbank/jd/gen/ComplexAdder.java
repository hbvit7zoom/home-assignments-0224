package ru.sberbank.jd.gen;

public class ComplexAdder<U, T> implements CustomAdder1<U, T> {
    @Override
    public T sum(U integer) {
        return null;
    }

    public static void main(String[] args) {
        Integer sum = new ComplexAdder<String, Integer>().sum("123");
    }
}
