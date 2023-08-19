package main.java.gof.pattern.structural.decorator;

class SimpleGift implements Gift {
    @Override
    public double getPrice() {
        return 20.0;
    }
    @Override
    public String getDescription() {
        return "Simple Gift";
    }
}
