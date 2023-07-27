package main.java.gof.pattern.structural.facade;

public class OrderFacade {

    private ProductAvailability productAvailability;
    private OrderCalculator orderCalculator;
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;

    public OrderFacade() {
        this.productAvailability = new ProductAvailability();
        this.orderCalculator = new OrderCalculator();
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productCode, int quantity, String address) {
        if (productAvailability.isAvailable(productCode)) {
            double totalPrice = orderCalculator.calculateTotalPrice(productCode, quantity);
            paymentProcessor.processPayment(totalPrice);
            shippingService.shipOrder(productCode, quantity, address);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Product not available.");
        }
    }

}
