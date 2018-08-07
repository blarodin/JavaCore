package ua.com.codefire._08_classes_adv;

public class SportCar extends Car {

    private boolean turbo;

    public SportCar() {
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    void engineOn() {
        System.out.println("Grr-r-r-r-r-r!");
    }

    @Override
    void radioOn() {
        System.out.println("Radio play!");
    }

    @Override
    void boost() {
        System.out.println("Quick boost...");
    }
}
