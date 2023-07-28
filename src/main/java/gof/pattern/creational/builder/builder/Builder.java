package main.java.gof.pattern.creational.builder.builder;

import main.java.gof.pattern.creational.builder.model.car.CarType;
import main.java.gof.pattern.creational.builder.model.component.Engine;
import main.java.gof.pattern.creational.builder.model.component.GPSNavigator;
import main.java.gof.pattern.creational.builder.model.component.Transmission;
import main.java.gof.pattern.creational.builder.model.component.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
