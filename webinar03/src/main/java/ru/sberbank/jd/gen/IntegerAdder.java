package ru.sberbank.jd.gen;

public class IntegerAdder implements CustomAdder<Integer> {

    Integer value;

    public IntegerAdder(Integer value) {
        this.value = value;
    }

    @Override
    public Integer sum(Integer i) {
        return value + i;
    }

    public static void main(String[] args) {
        IntegerAdder integerAdder = new IntegerAdder(5);
        System.out.println(integerAdder.sum(5));
        System.out.println(integerAdder.sum(10));
    }
}
