package main.java.gof.pattern.structural.facade;

public class FacadeExample {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        String productCode = "P123";
        int quantity = 2;
        String address = "123 Main Street";

        orderFacade.placeOrder(productCode, quantity, address);
    }

}
