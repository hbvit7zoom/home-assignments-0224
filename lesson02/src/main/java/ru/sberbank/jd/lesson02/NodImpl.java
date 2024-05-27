package ru.sberbank.jd.lesson02;

/**
 * Реализация интерфейса Nod.
 */
public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {

        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }

        return first;
    }
}
