package ru.sberbank.jd.oop;

public class Main1 {

    private Operator operator;

    public Main1(Operator operator) {
        this.operator = operator;
    }

    public void doSmt(int a, int b){
        int make = operator.make(a, b);
        System.out.println(make);
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1(new Summator());
        Main1 main2 = new Main1(new Multiplier());

        main1.doSmt(2, 3);
        main2.doSmt(2, 3);

        Main1 main3 = new Main1(new Operator() {
            @Override
            public int make(int a, int b) {
                return 0;
            }
        });
        main3.doSmt(2, 3);

    }
}
