package Polymorphism.Exercise2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee full = new FullTimeEmployee();
        Employee part = new PartTimeEmployee();
        Employee contract = new ContractEmployee();


        int choice;
        while (true) {
            System.out.println(" Welcome to the Employees Portal  \n 1. FullTime \n 2. PartTime \n 3. Contract ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(" Enter your name : ");
                    String fullName=sc.nextLine();
                    System.out.print(" Enter your baseSalary : ");
                    double baseSalary=sc.nextDouble();
                    full.setName(fullName);
                    full.setBaseSalary(baseSalary);
                    full.calculateSalary();
                    break;
                case 2:
                    System.out.print(" Enter your name : ");
                    String fulName=sc.nextLine();
                    System.out.print(" Enter your baseSalary : ");
                    double beseSalary=sc.nextDouble();
                    part.setName(fulName);
                    part.setBaseSalary(beseSalary);
                    part.calculateSalary();
                    break;
                case 3:
                    System.out.print(" Enter your name : ");
                    String fulyName=sc.nextLine();
                    System.out.print(" Enter your baseSalary : ");
                    double basaSalary=sc.nextDouble();
                    contract.setName(fulyName);
                    contract.setBaseSalary(basaSalary);
                    contract.calculateSalary();
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid input");

            }
        }

    }
}
