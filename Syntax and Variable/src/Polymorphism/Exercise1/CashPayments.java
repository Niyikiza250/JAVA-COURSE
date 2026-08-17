package Polymorphism.Exercise1;

public class CashPayments extends Payments{
    @Override
    void makePayment() {
        System.out.println(" You can make a Payments using the money you have in your hands");
    }
}
