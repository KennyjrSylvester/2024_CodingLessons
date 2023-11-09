package main;

import java.util.Scanner;

import main.Shapes.Rectangle;

public class RadiusArea {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] varArgs) {

        Shape c3 = new Rectangle(70, 3);
        System.out.println("The area is " + c3.area() + " and the perimertre is " + c3.perimetre());
        /*
         * System.out.println("What is your radius");
         * double radius = sc.nextDouble();
         * System.out.println("What is your second radius");
         * double radius2 = sc.nextDouble();
         * 
         * Circle firstCircle = new Circle();
         * Circle secondCircle = new Circle();
         * 
         * firstCircle.setRadius(radius);
         * secondCircle.setRadius(radius2);
         * System.out
         * .println("Your first circles area is: " + firstCircle.area() + " Your second circles area is: " + secondCircle.area());
         */
    }
}
