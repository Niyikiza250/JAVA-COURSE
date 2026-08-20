package Polymorphism.Exercise3;

public class Triangle extends Shape{


    @Override
    void calculateArea() {
        double Area=(getBase()*getWeight())/2;
        System.out.println(" The Area of Triangle Formula ==> Base*Weight/2");
        System.out.println(" The entered bage = "+getBase() + " \n entered Weight = "+getWeight());
        System.out.println(" The  Triangle Area is "+Area);
    }
}
