package ua.com.codefire._05_classes;

public class Main {

    public static void main(String[] args) {
        /*
        Contact first = new Contact();
        first.name = "Ivan";
        first.phone = "111-22-33";
        first.email = "ivan@site.com";

        Contact second = new Contact();
        second.name = "Petr";
        second.phone = "123-45-67";
        second.email = "petr@site.com";
        */

        Contact first = new Contact();
        first.setName("Ivan"); // set value
        System.out.println(first.getName()); // get value

        System.out.println(Calculator.sum(2, 4));

    }
}
