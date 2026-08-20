package Polymorphism.Exercise5;

public class Bank extends Payment{

    @Override
    void pay() {
        double Balance=getBalance()-getMoneyToPay();
        System.out.println(" Account Holder Name : "+getAccountHolderName());
        System.out.println(" Account Number : "+ getAccountNumber());
        System.out.println(" Money to be Payed : "+getMoneyToPay());
        System.out.println(" The new balance on your Bank account : "+Balance);
    }

    @Override
    void refund() {
        double Balance =getBalance()+getMoneyToRefund();
        System.out.println(" Account Holder Name : "+getAccountHolderName());
        System.out.println(" Account Number : "+ getAccountNumber());
        System.out.println(" Money to be Refunded : "+getMoneyToRefund());
        System.out.println(" The new balance on your Bank account : "+Balance);
    }
}
