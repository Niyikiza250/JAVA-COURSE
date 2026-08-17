package Polymorphism.Exercise2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        Employee full = new FullTimeEmployee();
        Employee part = new PartTimeEmployee();
        Employee contract = new ContractEmployee();
        int choice;
        System.out.println(" Welcome to the Employees Portal \n 1. Employee \n 2. FullTime \n 3. PartTime \n 4. Contract ");
        choice= scan.nextInt();

        switch (choice){
            case 1 :
                emp.calculateSalary(scan);
                break;
            case 2:
                full.calculateSalary(scan);
                break;
            case 3:
                part.calculateSalary(scan);
                break;
            case 4:
                contract.calculateSalary(scan);
                break;
            default:
                System.out.println(" Invalid input");
        }

    }
}
