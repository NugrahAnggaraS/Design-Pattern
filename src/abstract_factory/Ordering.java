package abstract_factory;

import abstract_factory.factory.Services.ServiceFactory;
import abstract_factory.factory.payment.PaymentFactory;

public class Ordering {
    public void printPayment(ServiceFactory serviceFactory,PaymentFactory paymentFactory){
        double price = serviceFactory.createService().price();
        paymentFactory.createPaymentMethod().createPayment(price);
    }
}
