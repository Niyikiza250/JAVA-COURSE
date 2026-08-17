package Polymorphism.Exercise2;

import Polymorphism.Exercise1.Payments;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {

    @Override
    void calculateSalary(Scanner scan) {
        scan.nextLine();
        while (true) {
            System.out.println(" Enter your name : ");

            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                String name = scan.nextLine();
                System.out.println(" How many day you worked 15-30 : ");
                if (workingDays > 15 && workingDays <= 30) {
                    double salary = scan.nextDouble();
                    break;
                } else {
                    System.out.println(" Invalid days !! \n Enter How many day you worked 15-30 : ");
                }
            } else {
                System.out.println(" Re-Enter your name : ");

            }
        }
        System.out.println(" The Part time Employees Portal \n My name is : "+name);
        System.out.println(" The Part Time Salary is : "+ salary);
    }
}
