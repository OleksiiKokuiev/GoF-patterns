package main.java.gof.pattern.behavioral.observer;

class PhoneApp implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        notifyUser();
    }

    private void notifyUser() {
        System.out.println("Phone App: The weather has changed to " + weather);
    }
}
