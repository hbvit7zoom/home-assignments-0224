package ru.sberbank.jd.io;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Some text");

        InputStream in = System.in;

        Scanner scanner = new Scanner(in);


        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }

        System.out.println(sb);
    }
}
