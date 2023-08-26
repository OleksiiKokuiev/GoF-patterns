package main.java.gof.pattern.structural.adapter;

class LegacyAdapter implements TargetInterface {

    private LegacyLibrary legacyLibrary;

    public LegacyAdapter(LegacyLibrary legacyLibrary) {
        this.legacyLibrary = legacyLibrary;
    }

    @Override
    public void doNewAction() {
        legacyLibrary.doLegacyAction();
    }
}
