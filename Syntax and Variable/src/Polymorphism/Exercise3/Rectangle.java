package Polymorphism.Exercise3;

public class Rectangle extends Shape{





    @Override
    void calculateArea() {
        double Area= getLength()*getWidth();
        System.out.println(" The Area of Circle Formula ==> PI*radius^2");
        System.out.println(" Entered length is : "+getLength()+ "and Entered Width is "+getWidth());
        System.out.println( " Area : "+Area);
    }
}
