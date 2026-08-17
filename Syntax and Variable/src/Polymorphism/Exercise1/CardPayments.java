package Polymorphism.Exercise1;

public class CardPayments extends Payments{

    @Override
    void makePayment() {
        System.out.println(" You can now make Payment via Card for payments");
    }
}
