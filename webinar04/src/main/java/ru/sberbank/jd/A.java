package ru.sberbank.jd;

import java.sql.SQLOutput;
import java.util.Objects;

public class A {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = null;
        Object obj4 = obj1;

//        if (obj1 == obj2) {
//        if (obj1.equals(obj2)) {
//        if (obj1.equals(obj3)) {
//        if (obj1.equals(obj4)) {
//        if (obj4.equals(obj1)) {
//        if (obj3.equals(obj1)) {
//        if (obj1.equals(obj3)) {
//        if (Objects.equals(obj3, obj1)) {
        if (Objects.equals(obj1, obj3)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
