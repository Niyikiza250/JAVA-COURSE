package Polymorphism.Exercise4;

import Polymorphism.Exercise2.Employee;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        BankAccounts saving=new SavingAccounts();
        BankAccounts current =new CurrentAccounts();
        BankAccounts student = new StudentAccounts();


        int choice;
        while (true){
            System.out.println(" Make your of Interest to accounts ");
            System.out.println(" 1. Saving Account Interest");
            System.out.println(" 2. Current Account Interest");
            System.out.println(" 3. Student Account Interest");
            System.out.print(" Enter here : ");
            choice=scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    System.out.println("  WELCOME TO THE SAVING ACCOUNTS PORTAL");
                    System.out.println("=========================================");
                    String accountHolderName;
                    String accountNumber;
                    double balance;
                    System.out.print(" Enter your Account Hodler Name :");
                    accountHolderName=scan.nextLine();
                    saving.setAccountHolderName(accountHolderName);
                    System.out.print(" Enter your Account Number : ");
                    accountNumber= scan.nextLine();
                    saving
                            .setAccountNumber(accountNumber);
                    System.out.print(" Enter your Balance : ");
                    balance=scan.nextDouble();
                    scan.nextLine();
                    saving.setBalance(balance);
                    saving.CalculateInterests();
                    break;
                case 2:
                    System.out.println("  WELCOME TO THE CURRENT ACCOUNTS PORTAL");
                    System.out.println("=========================================");
                    String cu_accountHolderName;
                    String cu_accountNumber;
                    double cu_balance;
                    System.out.print(" Enter your Account Hodler Name :");
                    cu_accountHolderName=scan.nextLine();
                    current.setAccountHolderName(cu_accountHolderName);
                    System.out.print(" Enter your Account Number : ");
                    cu_accountNumber= scan.nextLine();
                    current.setAccountNumber(cu_accountNumber);
                    System.out.print(" Enter your Balance : ");
                    cu_balance=scan.nextDouble();
                    scan.nextLine();
                    current.setBalance(cu_balance);
                    current.CalculateInterests();
                    break;
                case 3:
                    System.out.println("  WELCOME TO THE STUDENT ACCOUNTS PORTAL");
                    System.out.println("=========================================");
                    String st_accountHolderName;
                    String st_accountNumber;
                    double st_balance;
                    System.out.print(" Enter your Account Hodler Name :");
                    st_accountHolderName=scan.nextLine();
                    current.setAccountHolderName(st_accountHolderName);
                    System.out.print(" Enter your Account Number : ");
                    st_accountNumber= scan.nextLine();
                    current.setAccountNumber(st_accountNumber);
                    System.out.print(" Enter your Balance : ");
                    st_balance=scan.nextDouble();
                    scan.nextLine();
                    current.setBalance(st_balance);
                    student.CalculateInterests();
                    scan.close();
                    return;
                default:
                    System.out.println(" Invalid input entered ");
            }
        }
    }
}
