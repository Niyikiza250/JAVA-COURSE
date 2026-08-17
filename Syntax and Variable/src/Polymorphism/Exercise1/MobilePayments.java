package Polymorphism.Exercise1;

public class MobilePayments extends Payments{

    @Override
    void makePayment() {
        System.out.println(" You can now make a payments  via  your  mobile phone ");
    }
}
