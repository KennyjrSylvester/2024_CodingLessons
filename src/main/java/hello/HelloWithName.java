package main.java.hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("what day is it");

        String day = scanner.nextLine();
        System.out.println("its" + day + " " + name);

    }

}