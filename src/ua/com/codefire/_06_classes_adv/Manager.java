package ua.com.codefire._06_classes_adv;

public class Manager extends Worker {

    private double sales;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public void doWork() {
        System.out.println("I sale a goods...");
    }
}
