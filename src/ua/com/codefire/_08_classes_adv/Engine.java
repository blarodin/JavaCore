package ua.com.codefire._08_classes_adv;

public class Engine {

    // Named constants
    /*
    public static final String GAS = "gas";
    public static final String DIESEL = "diesel";
    public static final String PROPAN = "propan";
    public static final String METAN = "metan";
    public static final String ELECTRIC = "electric";
    */

    public enum Type {
        GAS, DIESEL, PROPAN, METAN, ELECTRIC
    }

    private String model;
    private double capacity;
    private Type fuel;

    public Engine(String model, double capacity, Type fuel) {
        this.model = model;
        this.capacity = capacity;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Type getFuel() {
        return fuel;
    }

    public void setFuel(Type fuel) {
        this.fuel = fuel;
    }
}
