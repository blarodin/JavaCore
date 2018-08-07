package ua.com.codefire._08_classes_adv;

public abstract class Car {

    private String vendor;
    private String model;

    private Engine engine;

    public Car() {
        System.out.println("Default ctor of Car");
    }

    public Car(String vendor, String model, Engine engine) {
        this.vendor = vendor;
        this.model = model;
        this.engine = engine;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    abstract void engineOn();

    abstract void radioOn();

    abstract void boost();

}
