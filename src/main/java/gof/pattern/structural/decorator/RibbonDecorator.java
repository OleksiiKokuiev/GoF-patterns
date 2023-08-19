package main.java.gof.pattern.structural.decorator;

class RibbonDecorator extends GiftDecorator {
    public RibbonDecorator(Gift gift) {
        super(gift);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Decorated with ribbon";
    }
}
