package Inhertance.Exercise1;

import java.util.Scanner;

public class Student extends Person{
    private String studentId;
    private String course;

    public void setStudentId(Scanner scan) {
        while (true){
            System.out.println(" Enter your Student ID ");
            String studentId=scan.nextLine();
            if (!studentId.isEmpty()){
                this.studentId = studentId;
                break;
            }
            else {
                System.out.println("Enter your Student Id again");
            }
        }

    }

    public void setCourse(Scanner scan) {
        scan.nextLine();
        while (true){
            System.out.println(" Enter your Course name : ");
            String course=scan.nextLine();
            if (!course.isEmpty() && course.matches("[a-zA-Z ]+")){
                this.course = course;
                break;
            }
            else {
                System.out.println(" Invalid!!!!! \n Enter your course name again");
            }
        }

    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    void displayInfo(){
        System.out.println(" My student Id is : "+getStudentId() + " \n Course : "+getCourse());
    }




}
