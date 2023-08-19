package main.java.gof.pattern.structural.decorator;

public class DecoratorExample {

    public static void main(String[] args) {
        Gift simpleGift = new SimpleGift();
        System.out.println("Price: $" + simpleGift.getPrice() + ", Description: " + simpleGift.getDescription());

        Gift wrappedGift = new PaperWrapper(simpleGift);
        System.out.println("Price: $" + wrappedGift.getPrice() + ", Description: " + wrappedGift.getDescription());

        Gift ribbonWrappedGift = new RibbonDecorator(wrappedGift);
        System.out.println("Price: $" + ribbonWrappedGift.getPrice() + ", Description: " + ribbonWrappedGift.getDescription());
    }

}
