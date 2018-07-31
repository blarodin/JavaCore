package ua.com.codefire._06_classes_adv;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setName("Ivan");
        driver.setSalary(2500);
        driver.setOwner(true);
        driver.doWork();

        if(driver.isOwner()) {
            // some action here
        }

        HeadOfSales head = new HeadOfSales();
        head.setName("Petr");
        head.setSalary(4500);
        head.setSales(45_000);
        head.setStuf(5);

        Manager manager = new Manager();
        manager.setName("Sidor");
        manager.setSales(20_000);
        System.out.println(manager.getSalary());
        manager.doWork();

        if(driver instanceof Worker) {
            System.out.println("Driver is a Worker!");
        }

        if(manager instanceof Worker) {
            System.out.println("Manager is a Worker!");
        }

        // Worker worker = new Worker();

        // reference to Driver object
        Worker worker = new Driver();
        worker.doWork();

        // switch reference to Manager object
        worker = new Manager();
        worker.doWork();

        // clear the reference
        worker = null;
        // worker.doWork(); // NullPointerException

    }
}
