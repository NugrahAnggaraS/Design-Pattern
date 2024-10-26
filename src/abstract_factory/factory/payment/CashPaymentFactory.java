package abstract_factory.factory.payment;

public class CashPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new CashPayment();
    }
}
