package Inhertance.Exercise1;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;


    public void setName(Scanner scan) {
        while (true){
            System.out.println(" Enter your name here : ");
            String name=scan.nextLine();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")){
                this.name=name;
                break;
            }
            else {
                System.out.println(" invalid name !!\n Enter your name again : ");
            }
        }

    }

    public void setAge(Scanner scan) {
        while (true){
            System.out.println(" Enter your age : ");
            int age=scan.nextInt();
            if (age>=18 && age<=65){
                this.age = age;
                break;

            }
            else {
                System.out.println(" Invalid age!!!\n Enter your age again : ");
            }
            scan.nextLine();
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  void introduce(){
        System.out.println(" My name is "+ getName() + " \n I'm "+getAge() +" years old");
    };

}
