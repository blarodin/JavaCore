package ua.com.codefire._06_classes_adv;

public abstract class Worker {

    private String name; // null
    private double salary; // 0.0

    public Worker() {
        this.salary = 800; // default value
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void doWork();

    /*
    public void doWork() {
        System.out.println("My name is " + name);
    }
    */
}
