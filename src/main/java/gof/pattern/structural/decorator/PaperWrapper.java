package main.java.gof.pattern.structural.decorator;

class PaperWrapper extends GiftDecorator {
    public PaperWrapper(Gift gift) {
        super(gift);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Wrapped in paper";
    }
}
