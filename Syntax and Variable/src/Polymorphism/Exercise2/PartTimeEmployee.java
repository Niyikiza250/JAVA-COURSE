package Polymorphism.Exercise2;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{

    @Override
    void calculateSalary() {
        double salary= getBaseSalary()+(getBaseSalary()*0.10);
        System.out.println(" Part time Employees Information :");
        System.out.println(" Name : "+ getName());
        System.out.println(" Salary : "+ salary);
    }
}
