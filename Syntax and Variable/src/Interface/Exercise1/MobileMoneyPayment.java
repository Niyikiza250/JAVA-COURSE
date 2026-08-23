package Interface.Exercise1;

public class MobileMoneyPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println(" The amount to pay "+amount+ " from Mobile Money");
    }

    @Override
    public void refund(double amount) {
        System.out.println(" The amount to refund "+amount+ " from Mobile Money");
    }
}
