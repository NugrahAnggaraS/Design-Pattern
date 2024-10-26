package factory_method;


// melakukan penyesuaian pada class Ordering
public abstract class Ordering {

    public void showCost() {
        Services services = createServices();
        System.out.println("Total harga Adalah " + services.price());
    }

    public abstract Services createServices();
}

class OrderGoSend extends Ordering {
    @Override
    public Services createServices() {
        return new SendService();
    }
}

class OrderGoBike extends Ordering {
    @Override
    public Services createServices() {
        return new BikeService();
    }
}

class OrderGoCar extends Ordering {
    @Override
    public Services createServices() {
        return new CarService();
    }
}