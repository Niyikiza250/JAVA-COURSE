package Polymorphism.Exercise2;

import java.util.Scanner;

public class FullTimeEmployee extends  Employee{

    @Override
    public void setName(Scanner scan ) {
        while (true){
            System.out.println(" Enter your name : ");
             String name = scan.nextLine();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")){
                super.setName( String name);
                break;
            }
            else {
                System.out.println(" Re-Enter your name : ");
            }
        }

    }

    @Override
    public void setBaseSalary(double baseSalary) {
        super.setBaseSalary(baseSalary);
    }

    @Override
    public void setWorkingDays(double workingDays) {
        super.setWorkingDays(workingDays);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getWorkingDays() {
        return super.getWorkingDays();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    void calculateSalary(Scanner scan) {
        scan.nextLine();
        while (true) {
            System.out.println(" Enter your name : ");

            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                String name = scan.nextLine();
                System.out.println(" How many day you worked 4-30 : ");
                if (workingDays > 0 && workingDays <= 30) {
                    double salary = scan.nextDouble();
                    break;
                } else {
                    System.out.println(" Invalid days !! \n How many day you worked 0-30 : ");
                }
            } else {
                System.out.println(" Re-Enter your name : ");

            }
        }
        System.out.println(" Full time Employees Portal \n My name is : "+getName());
        System.out.println(" The full Time Salary is : "+ getSalary());
    }
    }


