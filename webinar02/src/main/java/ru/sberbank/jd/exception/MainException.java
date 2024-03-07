package ru.sberbank.jd.exception;

public class MainException {

    public static void main(String[] args) {
//        throw new RuntimeException();
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
//            System.out.println("Some error");
        }
    }
}
