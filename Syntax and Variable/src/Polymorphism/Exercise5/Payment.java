package Polymorphism.Exercise5;

public class Payment {

        private String accountHolderName;
        private String accountNumber;
        private double balance=100000;
        double moneyToPay;
        double moneyToRefund;

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.matches("[a-zA-Z ]+")) {
            this.accountHolderName = accountHolderName;

        }
        else {
            System.out.println(" Your name must be btn a-z or A-Z \n Enter your name :");
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length()>=8){
            this.accountNumber = accountNumber;
        }
        else {
            System.out.print(" Your account number must be btn 0-9 and must contain 8 digits or more \n Enter your account number : ");
        }
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setMoneyToPay(double moneyToPay) {
        if (moneyToPay>0 && moneyToPay<=balance) {
            this.moneyToPay = moneyToPay;
        }
        else {
            System.out.print(" The money to pay must not be greater than Balance\n Enter money to Pay :");
        }
    }

    public void setMoneyToRefund(double moneyToRefund) {
        if (moneyToRefund>0) {
            this.moneyToRefund = moneyToRefund;
        }
        else {
            System.out.println(" The money to refund must be greater 0 \n Enter money to Refund : ");
        }
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMoneyToPay() {
        return moneyToPay;
    }

    public double getMoneyToRefund() {
        return moneyToRefund;
    }

    void  pay(){
        double newBalance=getBalance()-getMoneyToPay();
        System.out.print(" Account Holder Name : "+getAccountHolderName());
        System.out.print(" Account Number : "+ getAccountNumber());
        System.out.print(" Money to be Payed : "+getMoneyToPay());
        System.out.print(" The new Balance is : "+newBalance);
    }

    void  refund(){
        double newBalance=getBalance()+getMoneyToRefund();
        System.out.print(" Account Holder Name : "+getAccountHolderName());
        System.out.print(" Account Number : "+ getAccountNumber());
        System.out.print(" Money to be Refund : "+getMoneyToRefund());
        System.out.print(" The new Balance is : "+newBalance);
    }
}
