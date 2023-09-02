package main.java.gof.pattern.structural.bridge;

public class BridgeExample {
    public static void main(String[] args) {
        Functionality onOff = new OnOffFunctionality();
        Functionality volumeControl = new VolumeControlFunctionality();

        Device tv = new TV();
        tv.setFunctionality(onOff);
        tv.useFunctionality();

        Device radio = new Radio();
        radio.setFunctionality(volumeControl);
        radio.useFunctionality();
    }
}
