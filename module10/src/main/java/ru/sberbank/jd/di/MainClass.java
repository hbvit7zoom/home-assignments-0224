package ru.sberbank.jd.di;

public class MainClass {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.doA();
    }
}

class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public String doA() {
        b.doB();
        return "A";
    }
}

class B {
    public String doB() {
        return "B";
    }
}
