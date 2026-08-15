package Exercise1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                Student stud = new Student();
                // Assigning values the variables

                stud.setName(scan);
                stud.setAge(scan);
                stud.setEmail(scan);
                stud.setMarks(scan);

                // Displaying the values from student class
                System.out.println("Name : " + stud.getName());
                System.out.println(" Age : " + stud.getAge());
                System.out.println(" Email : "+ stud.getEmail());
                System.out.println(" Your Grade : " + stud.getMarks());
            }
        }

