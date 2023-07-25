package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int us4 = (int) Math.pow(4, i);
            int us5 = (int) Math.pow(5, i);
            System.out.println("4^" + i + " = " + us4);
            System.out.println("5^" + i + " = " + us5);
        }
    }
}