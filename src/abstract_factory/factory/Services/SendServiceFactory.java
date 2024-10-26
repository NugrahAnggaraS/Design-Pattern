package abstract_factory.factory.Services;

public class SendServiceFactory implements ServiceFactory{
    @Override
    public Services createService() {
        return new SendService();
    }
}

