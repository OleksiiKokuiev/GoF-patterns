package main.java.gof.pattern.creational.builder;

import main.java.gof.pattern.creational.builder.builder.CarBuilder;
import main.java.gof.pattern.creational.builder.builder.CarManualBuilder;
import main.java.gof.pattern.creational.builder.director.Director;
import main.java.gof.pattern.creational.builder.model.car.Car;
import main.java.gof.pattern.creational.builder.model.car.Manual;

public class BuilderExample {

    public static void main(String[] args) {
        Director director = new Director();

        // The director receives a concrete builder object from the client (application).
        // The application itself knows which builder to use to obtain the desired product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is retrieved from the builder, as the Director most often
        // does not know or depend on the specific classes of builders and products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // The director may know more than one building recipe.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
