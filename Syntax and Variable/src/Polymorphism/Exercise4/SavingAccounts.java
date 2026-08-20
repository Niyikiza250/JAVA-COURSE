package Polymorphism.Exercise4;

public class SavingAccounts extends BankAccounts{

    @Override
    void CalculateInterests() {
        int time=3;
        double rate =0.7;
        double interest= getBalance()*rate*time;
        System.out.println("\n\n Account Holder Name : "+getAccountHolderName());
        System.out.println(" Account Number : " +getAccountNumber());
        System.out.println(" The balance Entered : "+ getBalance());
        System.out.println("\n\n The interest calculation results ");
        System.out.println(" The Interest for this account type is "+ interest+" \n\n");
    }
}
