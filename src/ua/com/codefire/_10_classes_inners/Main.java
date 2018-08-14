package ua.com.codefire._10_classes_inners;

import ua.com.codefire._10_classes_inners.example.Rectangle;
import ua.com.codefire._10_classes_inners.example.Storage;

public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // create instance of Inner class
        Outer.Inner sample = new Outer().new Inner();

        // create instance of Nested class
        Outer.Nested nested = new Outer.Nested();




        // Example with Inner class

        // Create Storage
        Storage storage = new Storage(3);

        // Create Item (by using inner class Item)
        Storage.Item item = storage.new Item("First");
        // Try to add into Storage
        int result = storage.add(item);
        // Check the result
        check(result);

        // And repeat actions ;)
        item = storage.new Item("Second");
        result = storage.add(item);
        check(result);

        storage.new Item("First");
        result = storage.add(item);
        check(result);

        result = storage.add(storage.new Item("Third"));
        check(result);

        result = storage.add(storage.new Item("Other"));
        check(result);




        // Example with Nested class
        // Rectangle rectangle = new Rectangle(10, 15, 150, 50);
        Rectangle rectangle = new Rectangle.Builder()
                .withX(10)
                .withY(15)
                .withWidth(150)
                .withHeight(50)
                .build();
    }

    private static void check(int result) {
        switch (result) {
            case -1:
                System.out.println("Storage is full!");
                break;
            case 0:
                System.out.println("Item Not unique!");
                break;
            case 1:
                System.out.println("Item added!");
                break;
            default:
                System.out.println("Wrong result...");
        }
    }
}

// default modifier (access ONLY in package)
class Example {
    public void method() {
    }
}