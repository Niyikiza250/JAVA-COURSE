package Polymorphism.Exercise2;

import java.util.Scanner;

public class FullTimeEmployee extends  Employee{

    @Override
    void calculateSalary() {
        double Salary= getBaseSalary()+(getBaseSalary()*0.10);
        System.out.println(" Full time Employees Information :");
        System.out.println(" name : "+getName());
        System.out.println(" Salary : "+ Salary);
    }
}


