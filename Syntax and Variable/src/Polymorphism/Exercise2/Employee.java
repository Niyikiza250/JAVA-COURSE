package Polymorphism.Exercise2;

import java.util.Scanner;

public  class Employee {

   private String name;
   private  double baseSalary;

    public void setName(String name) {

            if (!name.isEmpty() && name.matches("[a-zA-z ]+")){
                this.name = name;

            }

    }

    public void setBaseSalary(double baseSalary ){

            if (baseSalary>0){
               this.baseSalary = baseSalary;
            }

    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    void calculateSalary(){
        System.out.println(" Employees Information :");
        System.out.println(" name : "+getName());
        System.out.println(" Salary : "+ getBaseSalary());
    }
}
