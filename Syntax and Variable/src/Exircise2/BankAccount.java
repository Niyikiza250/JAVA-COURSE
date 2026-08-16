package Exircise2;

import java.util.Scanner;

public class BankAccount {
    private String accountName;
    private  String accountNumber;
    private double balance=5000;

    public void setAccountName(Scanner scan) {
        while (true){
            System.out.println(" Enter your Account Name : ");
            String accountName=scan.nextLine();
            if ( accountName.matches("[a-zA-Z ]+")){
                this.accountName = accountName;
                break;
            }
            else {
                System.out.println(" Invalid Account Name\n Enter your Account Name : ");
            }
        }

    }

    public void setAccountNumber(Scanner scan) {
        while (true){
            System.out.println(" Enter your Account Number : ");
            String accountNumber=scan.nextLine();
            if (accountNumber.matches("\\d{8,}")){
                this.accountNumber = accountNumber;
                break;
            }
            else {
                System.out.println(" The Account name must be at least 8 digit \n Enter your Account Name : ");
            }

        }

    }

    public void setBalance() {
            this.balance=balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    void deposit(Scanner scan){
        while (true){
            System.out.println(" Enter amount to depose : ");
            double amount=scan.nextDouble();
            if (amount>0){
                balance+=amount;
                break;
            }
            else {
                System.out.println(" The amount must be greater than zero\n Enter amount to depose : ");
            }


        }

    }
    void displayAccountInfo(){
        System.out.println(" Account Name : " + accountName);
        System.out.println(" Account Number : " + accountNumber);
        System.out.println(" Balance : " + balance);
    }
}
