package main.java.gof.pattern.structural.decorator;

public class GiftDecorator implements Gift{
    protected Gift decoratedGift;

    public GiftDecorator(Gift gift) {
        this.decoratedGift = gift;
    }

    @Override
    public double getPrice() {
        return decoratedGift.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedGift.getDescription();
    }
}
