package Polymorphism.Exercise1;

public class Main {

    static void main(String[] args) {
        Payments payment1 = new CardPayments();
        Payments payment2 = new MobilePayments();
        Payments payment3 = new CashPayments();
        Payments payment = new Payments();

        payment.makePayment();
        payment1.makePayment();
        payment2.makePayment();
        payment3.makePayment();

    }
}
