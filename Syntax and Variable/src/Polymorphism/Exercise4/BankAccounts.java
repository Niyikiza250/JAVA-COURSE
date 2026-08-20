package Polymorphism.Exercise4;

public class BankAccounts {
    private String AccountHolderName;
    private String AccountNumber;
    private double Balance;

    public void setAccountHolderName(String accountHolderName) {
        if (!accountHolderName.isEmpty() && accountHolderName.matches("[a-zA-Z ]+")){
            AccountHolderName = accountHolderName;
    }
      else {
            System.out.println(" Invalid Account Holder name \n Enter your Account Holder Name : ");
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length()>=8 && !accountNumber.matches("[a-zA-Z ]+")) {
            AccountNumber = accountNumber;
        }
       else {
            System.out.println(" your Account namer must be 0-9 and it must be at least 8 digits\n Enter your Account number : ");
        }
    }

    public void setBalance(double balance) {

        if (balance>50000) {

            Balance = balance;
        }
       else {
            System.out.println(" Your balance must be greater than 50k to get get interest\n Enter your balance : ");
        }
    }




    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    void CalculateInterests(){
        int time=3;
        double rate =0.5;
        double interest= getBalance()*rate*time;
        System.out.println(" Account Holder Name : "+getAccountHolderName()+"\n\n");
        System.out.println(" Account Number : " +getAccountNumber());
        System.out.println(" The balance Entered : "+ getBalance());
        System.out.println("\n\n The interest calculation results ");
        System.out.println(" The Interest for this account type is "+ interest+" \n\n");
    }
}
