package Polymorphism.Exercise2;

import java.util.Scanner;

public class Employee {

   private String name;
   private  double BaseSalary= 5000;
   private double workingDays;
   private  double salary= BaseSalary*workingDays;

    public void setName(Scanner scan) {

        while (true){
            System.out.println(" Enter your name : ");
            name = scan.nextLine();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")){
                this.name = name;
                System.out.println(" How many day you worked 4-30 : ");
                break;
            }
            else {
                System.out.println(" Re-Enter your name : ");
            }
        }

    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public void setWorkingDays(Scanner scan) {
        while (true){
            System.out.println(" How many day you worked 4-30 : ");
            double workingDays= scan.nextDouble();
            if (workingDays>0 && workingDays<=30){
                this.workingDays = workingDays;
                break;

            }
            else {
                System.out.println(" Invalid days !! \n How many day you worked 4-30 : ");
            }
        }

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public double getWorkingDays() {
        return workingDays;
    }

    public double getSalary() {
        return salary;
    }

    void calculateSalary(){


        System.out.println(" My name is " + name+ " \n My Salary : "+ salary+ " and i'm Employee");
    }
}
