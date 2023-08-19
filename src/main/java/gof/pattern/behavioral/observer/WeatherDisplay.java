package main.java.gof.pattern.behavioral.observer;

class WeatherDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Weather Display: The weather is " + weather);
    }
}
