package main.java.gof.pattern.structural.facade;

public class ShippingService {

    public void shipOrder(String productCode, int quantity, String address) {
        // delivery clearance logic
        System.out.println("Order shipped to " + address);
    }

}
