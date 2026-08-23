package Interface.Exercise1;

public class BankPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("\n\n the amount to pay is "+amount+" from Bank Account");
    }

    @Override
    public void refund(double amount) {
        System.out.println(" The amount to refund "+amount+" from Bank Account");
    }
}
