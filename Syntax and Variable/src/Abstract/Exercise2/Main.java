package Abstract.Exercise2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee full = new Fultime();
        Employee part = new PartTIme();
        Employee contract = new Contract();

        int choice;
        while (true){
            System.out.println(" WELCOME TO EMPLOYEE SYSTEM");
            System.out.println(" 1. FullTime");
            System.out.println(" 2. PartTime");
            System.out.println(" 3. Contract");
            System.out.print(" Enter here : ");
            choice=scan.nextInt();
            scan.nextLine();

            switch (choice){

                case 1:
                    System.out.println(" Enter your name");
                    String name= scan.nextLine();
                    full.setName(name);
                    System.out.println(" Enter your baseSalary ");
                    double basaSalary= scan.nextDouble();
                    full.setBasicSalary(basaSalary);
                    full.calculateSalary();
                    break;
                case 2:
                    System.out.println(" Enter your name");
                    String p_name= scan.nextLine();
                    part.setName(p_name);
                    System.out.println(" Enter your baseSalary ");
                    double p_basaSalary= scan.nextDouble();
                    part.setBasicSalary(p_basaSalary);
                    part.calculateSalary();
                    break;
                case 3:
                    System.out.println(" Enter your name");
                    String c_name= scan.nextLine();
                    contract.setName(c_name);
                    System.out.println(" Enter your baseSalary ");
                    double c_basaSalary= scan.nextDouble();
                    contract.setBasicSalary(c_basaSalary);
                    contract.calculateSalary();
                    return;


            }
        }
    }
}
