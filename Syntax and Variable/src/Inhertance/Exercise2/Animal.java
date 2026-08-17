package Inhertance.Exercise2;

import java.util.Scanner;

public class Animal {
     private String name;

    public String getName() {
        return name;
    }

    public void setName(Scanner scan) {
        while (true){
            System.out.println(" Enter the name of your animal");
            String name=scan.nextLine();
            if (!name.isEmpty()){
                this.name = name;
                break;
            }
            System.out.println(" You must enter something here ");
        }

    }

    void eat(){
        System.out.println(" the animals like"+getName()+"  Eat everything");
    }
}
