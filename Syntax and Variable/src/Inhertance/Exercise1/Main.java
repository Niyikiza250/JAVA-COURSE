package Inhertance.Exercise1;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Student study=new Student();

        study.setName(scan);
        study.setAge(scan);
        study.setCourse(scan);
        study.setStudentId(scan);


        study.introduce();
        study.displayInfo();
    }
}
