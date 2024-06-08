package ru.sberbank.jd.lesson02;

/**
 * Класс для поиска наибольшего общего делителя.
 */

public class NodImpl implements Nod {

    /**
     * Исполняемый метод.
     */

    public static void main(String[] args) {
        NodImpl nodImpl = new NodImpl();
        System.out.println(nodImpl.calculate(100, 52));
    }

    /**
     * Вычисляющий НОД метод.
     */

    @Override
    public int calculate(int first, int second) {
        if (first <= 0 || second <= 0) {
            throw new UnsupportedOperationException("Incorrect input");
        }

        while (first != 0 && second != 0) {
            if (first > second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        return first + second;
    }

}
