package Exercise3;

import java.util.Scanner;

public class Employee {
    private  String name;
    private  int age;
    private double salary;
    private  String department;


    public void setName(Scanner scan) {
        while (true){
            System.out.println(" Enter your name here : ");
            String name= scan.nextLine();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")){
                this.name = name;
                break;
            }
            else {
                System.out.println(" Invalid name \n Enter your name again : ");
            }
        }

    }

    public void setAge(Scanner scan) {
        while (true){
            System.out.println(" Enter your age :");
            int age=scan.nextInt();
            if (age>=18 && age<=65){
                this.age = age;
                break;

            }
            else {
                System.out.println(" Invalid age \n Enter your age : ");
            }
            scan.nextLine();
        }

    }

    public void setSalary(Scanner scan) {
        while (true){
            System.out.println(" Enter your salary : ");
            double salary=scan.nextDouble();
            if (salary>0){
                this.salary = salary;
                break;
            }
            else {
                System.out.println(" invalid salary amount\n Enter your salary : ");
            }
            scan.nextLine();
        }

    }

    public void setDepartment(Scanner scan) {
        while (true){
            System.out.println(" Enter your Department : ");
            String department=scan.nextLine();
            if (!department.isEmpty() && department.matches("[a-zA-Z ]+")){
                this.department = department;
                break;
            }
            else {
                System.out.println(" Invalid department \n Enter your Department");
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    void displayInfo(){
        System.out.println(" Name : " + getName());
        System.out.println(" Age : "+ getAge());
        System.out.println(" Salary : "+ getSalary());
        System.out.println(" Department : "+ getDepartment());
    }
}
