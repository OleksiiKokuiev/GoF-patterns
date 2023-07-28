package main.java.gof.pattern.creational.builder.builder;

import main.java.gof.pattern.creational.builder.model.car.CarType;
import main.java.gof.pattern.creational.builder.model.car.Manual;
import main.java.gof.pattern.creational.builder.model.component.Engine;
import main.java.gof.pattern.creational.builder.model.component.GPSNavigator;
import main.java.gof.pattern.creational.builder.model.component.Transmission;
import main.java.gof.pattern.creational.builder.model.component.TripComputer;

/**
 Unlike other creational patterns, Builders can create completely different products that do not share a common interface.

 In this case, we are producing a car user manual using the same steps as the cars themselves.
 This approach allows creating user manuals for specific car models, containing different features.
 */
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
