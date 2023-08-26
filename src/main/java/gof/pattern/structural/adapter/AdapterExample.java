package main.java.gof.pattern.structural.adapter;

public class AdapterExample {

    public static void main(String[] args) {

        LegacyLibrary legacyLibrary = new LegacyLibrary();

        TargetInterface adapter = new LegacyAdapter(legacyLibrary);

        Client client = new Client();
        client.performAction(adapter);
    }

}
