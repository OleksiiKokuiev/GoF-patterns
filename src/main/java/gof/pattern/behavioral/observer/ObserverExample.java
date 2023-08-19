package main.java.gof.pattern.behavioral.observer;

public class ObserverExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer weatherDisplay = new WeatherDisplay();
        Observer phoneApp = new PhoneApp();

        weatherStation.addObserver(weatherDisplay);
        weatherStation.addObserver(phoneApp);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
    }
}
