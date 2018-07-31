package ua.com.codefire._06_classes_adv;

/**
 * POJO <- Plain Old Java Object
 */
public class Driver extends Worker {

    private boolean owner; // false

    /**
     * Default constructor (ctor)
     */
    public Driver(){

    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    @Override
    public void doWork() {
        System.out.println("I drive a car...");
    }
}
