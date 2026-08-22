package Abstract.Exercise2;

public class Fultime extends Employee{

    @Override
    void calculateSalary() {
        double Salary=getBasicSalary()+(getBasicSalary()*0.5);
        System.out.println(" Name : "+getName());
        System.out.println(" Base Salary : "+getBasicSalary());
        System.out.println(" The total Salary is "+Salary);
    }
}
