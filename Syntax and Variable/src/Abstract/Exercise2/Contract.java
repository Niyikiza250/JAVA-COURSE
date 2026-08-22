package Abstract.Exercise2;

public class Contract extends Employee{

    @Override
    void calculateSalary() {
        double Salary=getBasicSalary()+(getBasicSalary()*0.8);
        System.out.println(" Name : "+getName());
        System.out.println(" Base Salary : "+getBasicSalary());
        System.out.println(" The total Salary is "+Salary);
    }
}
