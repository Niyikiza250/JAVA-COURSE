package Polymorphism.Exercise3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        int choice;
        while (true){
            System.out.println(" Choose the Area of shape you want to calculate : ");
            System.out.println(" 1. The Area of Circle");
            System.out.println(" 2. THe Area of Rectangle");
            System.out.println(" 3. The area of Triangle");
            choice= scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    double radius;
                    System.out.println(" Enter radius : ");
                    radius=scan.nextDouble();
                    scan.nextLine();
                    circle.setRadius(radius);
                    circle.calculateArea();
                    break;
                case 2:
                    double length;
                    double width;
                    System.out.println(" Enter Length : ");
                    length=scan.nextDouble();
                    System.out.println(" Enter width : ");
                    width=scan.nextDouble();
                    rectangle.setLength(length);
                    rectangle.setWidth(width);
                    rectangle.calculateArea();
                    break;
                case 3:
                    double base;
                    double weight;
                    System.out.println(" Enter Base : ");
                    base=scan.nextDouble();
                    System.out.println(" Enter Weight : ");
                    weight=scan.nextDouble();
                    triangle.setBase(base);
                    triangle.setWeight(weight);
                    triangle.calculateArea();
                    scan.close();
                    return;
            }
        }
    }
}
