package main.java.gof.pattern.structural.bridge;

class TV implements Device {
    private Functionality functionality;

    @Override
    public void setFunctionality(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void useFunctionality() {
        System.out.println("TV is in use.");
        functionality.performFunction();
    }
}
