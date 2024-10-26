package abstract_factory;

import abstract_factory.factory.Services.BikeServiceFactory;
import abstract_factory.factory.payment.CashPaymentFactory;

public class App {
    public static void main(String[] args) {
        Ordering orderGobikeWithCash = new Ordering();
        orderGobikeWithCash.printPayment(new BikeServiceFactory(), new CashPaymentFactory());
    }
}
