package Abstract.Exercise2;

public abstract class Employee {
    private String name;
    private double basicSalary;


    public void setName(String name) {
        if (name.matches("[a-zA-Z ]+")) {
            this.name = name;
        }
        else {
            System.out.println(" Your name must be btn a-z");
        }
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary>0) {
            this.basicSalary = basicSalary;
        }
        else {
            System.out.println(" your Basic Salary must be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    abstract void calculateSalary();


}
