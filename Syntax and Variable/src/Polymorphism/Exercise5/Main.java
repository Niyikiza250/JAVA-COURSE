package Polymorphism.Exercise5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Payment creditCard=new CreditCardTransfer();
        Payment mobileMoney=new MobileMoney();
        Payment bank=new Bank();

        int choice;
        while (true){
            System.out.println(" WELCOME TO THE PAYMENT SYSTEM ");
            System.out.println(" Choose Service you want to Perform : ");
            System.out.println(" 1. Credit Card ");
            System.out.println(" 2. Mobile money ");
            System.out.println(" 3. Bank ");
            System.out.print(" Enter here : ");
            choice=scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    int choose1;
                    while (true){
                        System.out.println(" Choose what to do :");
                        System.out.println(" 1. To pay");
                        System.out.println(" 2. TO refund");
                        System.out.print(" Enter here : ");
                        choose1=scan.nextInt();
                        scan.nextLine();
                        switch (choose1){
                            case 1:
                                String accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                accountName=scan.nextLine();
                                creditCard.setAccountHolderName(accountName);
                                String accountNumber;
                                System.out.print(" Enter your account number : ");
                                accountNumber=scan.nextLine();
                                creditCard.setAccountNumber(accountNumber);
                                double amount;
                                System.out.println(" Enter the amount to pay ");
                                amount= scan.nextDouble();
                                creditCard.setMoneyToPay(amount);

                                creditCard.pay();
                                break;
                            case 2:
                                String R_accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                R_accountName=scan.nextLine();
                                creditCard.setAccountHolderName(R_accountName);
                                String R_accountNumber;
                                System.out.print(" Enter your account number : ");
                                R_accountNumber=scan.nextLine();
                                creditCard.setAccountNumber(R_accountNumber);
                                double c_amount;
                                System.out.println(" Enter the amount to refund ");
                                c_amount= scan.nextDouble();
                                creditCard.setMoneyToRefund(c_amount);
                                creditCard.refund();
                                return;
                        }
                    }
                case 2:
                    int choose2;
                    while (true){
                        System.out.println(" Choose what to do :");
                        System.out.println(" 1. To pay");
                        System.out.println(" 2. TO refund");
                        System.out.print(" Enter here : ");
                        choose2=scan.nextInt();
                        scan.nextLine();
                        switch (choose2){
                            case 1:
                                String accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                accountName=scan.nextLine();
                                mobileMoney.setAccountHolderName(accountName);
                                String accountNumber;
                                System.out.print(" Enter your account number : ");
                                accountNumber=scan.nextLine();
                                mobileMoney.setAccountNumber(accountNumber);
                                double amount;
                                System.out.println(" Enter the amount to pay ");
                                amount= scan.nextDouble();
                                mobileMoney.setMoneyToPay(amount);
                                mobileMoney.pay();
                                break;
                            case 2:
                                String R_accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                R_accountName=scan.nextLine();
                                mobileMoney.setAccountHolderName(R_accountName);
                                String R_accountNumber;
                                System.out.print(" Enter your account number : ");
                                R_accountNumber=scan.nextLine();
                                mobileMoney.setAccountNumber(R_accountNumber);
                                double r_amount;
                                System.out.println(" Enter the amount to refund ");
                                r_amount= scan.nextDouble();
                                mobileMoney.setMoneyToRefund(r_amount);
                                mobileMoney.refund();
                                return;
                        }
                    }
                case 3:
                    int choose3;
                    while (true){
                        System.out.println(" Choose what to do :");
                        System.out.println(" 1. To pay");
                        System.out.println(" 2. TO refund");
                        System.out.print(" Enter here : ");
                        choose3=scan.nextInt();
                        scan.nextLine();
                        switch (choose3){
                            case 1:
                                String accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                accountName=scan.nextLine();
                                bank.setAccountHolderName(accountName);
                                String accountNumber;
                                System.out.print(" Enter your account number : ");
                                accountNumber=scan.nextLine();
                                bank.setAccountNumber(accountNumber);
                                double amount;
                                System.out.println(" Enter the amount to pay ");
                                amount= scan.nextDouble();
                                bank.setMoneyToPay(amount);
                                bank.pay();
                                break;
                            case 2:
                                String R_accountName;
                                System.out.print(" Enter your account Holder Name: ");
                                R_accountName=scan.nextLine();
                                bank.setAccountHolderName(R_accountName);
                                String R_accountNumber;
                                System.out.print(" Enter your account number : ");
                                R_accountNumber=scan.nextLine();
                                bank.setAccountNumber(R_accountNumber);
                                double b_amount;
                                System.out.println(" Enter the amount to refund ");
                                b_amount= scan.nextDouble();
                                bank.setMoneyToRefund(b_amount);
                                bank.refund();
                                return;
                        }
                    }
            }
        }
    }
}
