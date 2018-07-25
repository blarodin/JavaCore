package ua.com.codefire._04_methods;

import java.io.FileNotFoundException;

/**
 * @author Yevhenii Rodin
 */
public class Main {

    /**
     * Entry point of the App
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
	    double a = 10, b = 20;
        calculate(a, b); // call method

        a = 15;
        b = 30;
        calculate(a, b); // call method

        String message = getMessage("John Doe");

        process(3);
        process("4.19");
        process(3.14);

        System.out.println(127);
        System.out.println("Hello");

        String data = "This is my sample data for testing purpose...";
        DataManager.storeData(data);
        DataManager.storeData(data, "myfile.txt");
    }

    /**
     * Method for calculation
     * @param a first param
     * @param b second param
     */
    public static void calculate(double a, double b){
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(); // print '\n'
    }

    /**
     * Get formatted message for greetings
     * @param name the name of the user
     * @return formatted string
     */
    static String getMessage(String name) {
        if(name == null || name.isEmpty()) {
            name = "John Doe";
        }
        return "Hello, " + name + '!';
    }

    static void process(String value) {
        System.out.println("Result: " + value);
    }

    static void process(double value) {
        System.out.println("Result: " + (value * 2));
    }

    static void process(int value) {
        System.out.println("Result: " + (value * 2));
    }
}
