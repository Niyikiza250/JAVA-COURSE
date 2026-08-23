package Interface.Exercise1;

public class Main {
    static void main(String[] args) {
        Payment card = new CardPayment();
        Payment momo = new MobileMoneyPayment();
        Payment bank = new BankPayment();

        card.pay(5000);
        card.refund(3000);

        momo.refund(4000);
        momo.pay(5000);

        bank.pay(10000);
        bank.refund(3000);
    }
}
