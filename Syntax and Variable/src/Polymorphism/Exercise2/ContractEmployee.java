package Polymorphism.Exercise2;

import Polymorphism.Exercise1.Payments;

import java.util.Scanner;

public class ContractEmployee extends Employee {


    @Override
    void calculateSalary(Scanner scan) {
        scan.nextLine();
        while (true) {
            System.out.println(" Enter your name : ");

            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                String name = scan.nextLine();
                System.out.println(" How many days are on your Contract : ");
                if (workingDays > 4 && workingDays <= 30) {
                    double salary = scan.nextDouble();
                    break;
                } else {
                    System.out.println(" Invalid days !! \n Enter many days appears on your contract 4-30 : ");
                }
            } else {
                System.out.println(" Re-Enter your name : ");

            }
        }
        System.out.println(" Contract  Employees Portal \n My name is : "+name);
        System.out.println(" The  Salary for contract Employee is : "+ salary);

}
}
