package Inhertance.Exercise2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog = new Dog();

        dog.setName(scan);
        dog.setBreed(scan);

        dog.eat();
        dog.bark();
    }
}
