package Conditions.Step1;

import java.util.Scanner;

public class Student {
    String fullName;
    String studentId;
    int age;


    void Display() {
        System.out.println(" Name : "+fullName+ "\n ID : "+ studentId+" \n Age : "+age);
    }


    static   class  Main{
        static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Student s1 = new Student();
            System.out.println(" WELCOME TO STUDENT PARTAL");
            System.out.println(" Enter your name here : ");
            s1.fullName=input.nextLine();
            System.out.println(" Enter your student ID : ");
            s1.studentId=input.nextLine();
            System.out.println(" Enter your AGe : ");
            s1.age=input.nextInt();

            s1.Display();
        }
    }
}
