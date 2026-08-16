package Exircise2;

import java.util.Scanner;

public class Mian {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount bank = new BankAccount();


        bank.setAccountName(scan);
        bank.setAccountNumber(scan);

        bank.deposit(scan);
        bank.displayAccountInfo();
    }
}
