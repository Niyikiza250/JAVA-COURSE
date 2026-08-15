package Exercise1;

import java.util.Scanner;
public class Student {
    private String name;
    private int age;
    private String email;
    private double marks;
    public void setName(Scanner scan) {
        while (true){
            System.out.println(" Enter your name ");
            String name= scan.nextLine();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                this.name = name;
                break;
            }
            System.out.println("Invalid input \n Enter your name:");
        }
    }
    public void setAge(Scanner scan) {
        while (true){ System.out.println(" Enter your age : ");
            int age= scan.nextInt();
            if (age>=18 && age<=60){
                this.age = age; break;
            } else {
                System.out.println(" The age must be between 18 and 60\n Enter your age : ");
            }

        }
    }
    public void setEmail(Scanner scan) {
        scan.nextLine();
        while (true){
            System.out.println(" Enter your Email");
            String email= scan.nextLine();
            if (email.contains("@")){
                this.email = email; break;
            }
            System.out.println(" The Email must contain @ \n Re-enter your email : ");
        }
    }
    public void setMarks(Scanner scan) {
        while (true){
            System.out.println(" Enter your marks");
            double marks=scan.nextDouble();
            if (marks>=0 && marks<=100){
                this.marks = marks; break;
            } else { System.out.println(" Enter your marks \n Re-enter your marks : ");

            }
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getMarks() {
    if (marks >= 80) { return "A";
    } else if (marks >= 70) { return "B";
    } else if (marks >= 60) { return "C";
    } else if (marks >= 50) { return "D";
    } else { return "F";
    }
}
}