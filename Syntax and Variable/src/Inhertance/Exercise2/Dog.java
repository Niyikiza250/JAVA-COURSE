package Inhertance.Exercise2;

import java.util.Scanner;

public class Dog extends Animal{
     private String Breed;

    public String getBreed() {
        return Breed;
    }

    public void setBreed(Scanner scan) {
        while (true){
            System.out.println("Enter the Breed of your "+getName()+"! : ");
            String Breed= scan.nextLine();
            if (!Breed.isEmpty() && Breed.matches("[a-zA-Z ]+")){
                this.Breed = Breed;
                break;
            }
            System.out.println(" Invalid !! \n Enter the Breed name again : ");
        }

    }

    void bark(){
        System.out.println(" Animal like "+getName()+" especially " + getBreed()+ " type knows how to runs fast");
    }
}
