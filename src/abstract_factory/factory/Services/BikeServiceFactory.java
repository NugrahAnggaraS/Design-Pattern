package abstract_factory.factory.Services;

public class BikeServiceFactory implements ServiceFactory{
    @Override
    public Services createService() {
        return new BikeService();
    }
}
