package ru.sberbank.jd.exception;

public class MainException1 {

    public static void main(String[] args) {
        MainException1 mainException1 = new MainException1();
        try {
            mainException1.methodWithError();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void methodWithError() throws Exception {
        throw new Exception();
    }
}
