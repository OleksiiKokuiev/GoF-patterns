package main.java.gof.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private final List<Observer> observers = new ArrayList<>();
    private String currentWeather;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setWeather(String weather) {
        currentWeather = weather;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentWeather);
        }
    }
}
