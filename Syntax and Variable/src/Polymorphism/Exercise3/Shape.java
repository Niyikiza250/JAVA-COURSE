package Polymorphism.Exercise3;

public class Shape {
    private  double radius;


    public void setRadius(double radius) {
        if (radius>0) {
            this.radius = radius;
        }
    }



    public double getRadius() {
        return radius;
    }



    private double Length;
    private double Width;


    public void setLength(double length) {
        if (length>0) {
            Length = length;
        }
        else {
            System.out.println(" the length must be greater than 0 \n Enter length : ");
        }
    }

    public void setWidth(double width) {
        if (width>0){
            Width = width;
        }
        else {
            System.out.println(" the width must be greater than zero \n enter width : ");
        }
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    private double base;
    private  double weight;

    public void setBase(double base) {
        if (base>0){
            this.base = base;
        }
        else {
            System.out.println(" the base must be more that 0 \n enter base : ");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println(" the entered weight is invalid \n Enter weight : ");
        }
    }

    public double getBase() {
        return base;
    }

    public double getWeight() {
        return weight;
    }


    void calculateArea(){

    }
}
