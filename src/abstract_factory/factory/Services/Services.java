package abstract_factory.factory.Services;

public interface Services {
    double price();
}


class CarService implements Services{

    @Override
    public double price() {
        return 20000;
    }
}

class BikeService implements Services{

    @Override
    public double price() {
        return 10000;
    }
    
}

class SendService implements Services{
    @Override
    public double price() {
        return 100000;
    }
}
