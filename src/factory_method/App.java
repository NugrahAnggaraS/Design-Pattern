package factory_method;

public class App {
    public static void main(String[] args) {
        Ordering orderGoBike = new OrderGoBike();
        orderGoBike.showCost();

        Ordering orderGoCar = new OrderGoCar();
        orderGoCar.showCost();

        Ordering orderGoSend = new OrderGoSend();
        orderGoSend.showCost();
    }

}
