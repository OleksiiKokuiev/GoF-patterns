package main.java.gof.pattern.structural.bridge;

class Radio implements Device {
    private Functionality functionality;

    @Override
    public void setFunctionality(Functionality functionality) {
        this.functionality = functionality;
    }

    @Override
    public void useFunctionality() {
        System.out.println("Radio is in use.");
        functionality.performFunction();
    }
}
