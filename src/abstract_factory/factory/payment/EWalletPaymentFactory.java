package abstract_factory.factory.payment;

public class EWalletPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPaymentMethod() {
        return new EWalletPayment();
    }
}
