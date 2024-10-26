package abstract_factory.factory.payment;

public interface Payment {
    void createPayment(double cost);
}

class CashPayment implements Payment{
    @Override
    public void createPayment(double cost) {
        System.out.println("Telah Membayar Cash Biaya Perjalanan Sebesar " + cost);
    }
}


class EWalletPayment implements Payment{
    @Override
    public void createPayment(double cost) {
        System.out.println("Telah Membayar EWallet Biaya Perjalanan Sebesar " + cost);
    }
}
