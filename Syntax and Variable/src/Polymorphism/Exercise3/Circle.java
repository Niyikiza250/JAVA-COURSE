package Polymorphism.Exercise3;

public class Circle extends Shape{



    @Override
    void calculateArea() {
        double area= (getRadius()*getRadius()*Math.PI);
        System.out.println(" The Area of Circle Formula ==> PI*radius^2");
        System.out.println(" Entered radius is : "+getRadius()+ " now area is = PI*radius^2  then ");
        System.out.println( " Area : "+area + "\n\n");
    }
}
