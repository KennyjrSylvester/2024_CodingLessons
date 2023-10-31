package main;

import java.util.Scanner;

public class Receipt {
    static final double TAX_RATE = 0.13;

    public static void main(String[] varArgs) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("how much did it cost");
        double cost = scanner.nextDouble();
        System.out.println("Taxes: " + (cost * TAX_RATE));

    }
}
