package main.java.gof.pattern.structural.bridge;

public class VolumeControlFunctionality implements Functionality {
    @Override
    public void performFunction() {
        System.out.println("Volume is adjusted.");
    }
}
