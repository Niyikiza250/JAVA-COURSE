package Exercise3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employ= new Employee();


        employ.setName(scan);
        employ.setAge(scan);
        employ.setSalary(scan);
        employ.setDepartment(scan);


        employ.displayInfo();
    }
}
