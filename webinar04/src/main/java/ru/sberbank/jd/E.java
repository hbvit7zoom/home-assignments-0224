package ru.sberbank.jd;

public class E implements Comparable<E>{

    private int i;
    private String s;

    @Override
    public int compareTo(E o) {
        int result = i - o.i;
        if (result == 0) {
            return s.length() - o.s.length();
        }
        return result;
    }
}
