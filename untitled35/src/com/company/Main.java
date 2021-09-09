package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");

        int a = in.nextInt();
        System.out.println("Таблица умножения для "+a+":");
        for (int b=0; b< 10; b++){
            System.out.println(a + " x " + (b+1) + " = " +
                    (a * (b+1)));
        }
    }
}
