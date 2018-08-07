package ua.com.codefire._08_classes_adv;

public class FamilyCar extends Car {

    private boolean freezer;

    public FamilyCar() {
    }

    public FamilyCar(String vendor, String model, Engine engine, boolean freezer) {
        super(vendor, model, engine);
        this.freezer = freezer;
    }

    public boolean isFreezer() {
        return freezer;
    }

    public void setFreezer(boolean freezer) {
        this.freezer = freezer;
    }

    @Override
    void engineOn() {
        System.out.println("Engine start!");
    }

    @Override
    void radioOn() {
        System.out.println("Radio on!");
    }

    @Override
    void boost() {
        System.out.println("Slow boost...");
    }
}
