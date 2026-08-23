package Interface.Exercise1;

public class CardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println(" The amount to pay "+amount+ " from your Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println(" The amount to Refund "+amount+ " from your Card\n\n");
    }
}
