package Polymorphism.Exercise2;

import java.util.Scanner;

public class ContractEmployee extends Employee {


    @Override
    void calculateSalary() {
        double Salary= getBaseSalary()+(getBaseSalary()*0.10);;
        System.out.println(" Contractors Employees Information");
        System.out.println(" Name : "+getName());
        System.out.println(" Salary : "+Salary);
    }
}
