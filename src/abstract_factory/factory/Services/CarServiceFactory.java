package abstract_factory.factory.Services;

public class CarServiceFactory implements ServiceFactory {
    @Override
    public Services createService() {
        return new CarService();
    }
}