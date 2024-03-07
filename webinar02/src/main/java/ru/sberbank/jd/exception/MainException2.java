package ru.sberbank.jd.exception;

public class MainException2 {

    public static void main(String[] args) {
        try {
            int i = 1 + 2;
//            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("some error 2");
        } catch (Exception e) {
            System.out.println("some error 1");
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Finish!");
    }
}
