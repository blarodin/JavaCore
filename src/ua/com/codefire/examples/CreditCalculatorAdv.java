package ua.com.codefire.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Credit Calculator (advanced version)
 * For education purpose in JavaCore
 * @author Yevhenii Rodin (blarodin@gmail.com)
 */
public class CreditCalculatorAdv {

    /*
    Constants for calculations
     */
    private static final double PERCENT = 1.9;
    private static final int MIN_MONTHS = 3;
    private static final int MAX_MONTHS = 24;
    private static final int CREDIT_LIMIT = 30_000;

    /**
     * Keyboard stream-reader for User's input data
     */
    private static final BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Main method (aka 'Entry point of App')
     * @param args command-line arguments (not using in App)
     */
    public static void main(String[] args) {
        printAppBanner();
        while (true) {
            int selection = 0;
            try {
                selection = getAction();
            } catch (IOException | NumberFormatException ex) {
                warning("Input only numbers!");
                continue;
            }
            switch (selection) {
                case 1:
                    calculate();
                    break;
                case 2:
                    System.exit(0);
                default:
                    warning("Unknown action!");
            }
        }
    }

    /**
     * Print info banner for the App
     */
    private static void printAppBanner() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~ Credit Calculator (v. 0.1) ~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    /**
     * Get action from User
     * @return number of action
     * @throws IOException if User's input has wrong data (string, etc.)
     */
    private static int getAction() throws IOException {
        System.out.println("Credit Calculator:");
        System.out.println("1. Calculate the Credit");
        System.out.println("2. Close the App");
        System.out.print("Make your choice: ");
        return Integer.parseInt(keyboard.readLine());
    }

    /**
     * Print warning message for User
     * @param message message to print
     */
    private static void warning(String message) {
        System.out.println("****************************************************");
        System.out.println("Warning: " + message);
        System.out.println("****************************************************");
    }

    /**
     * Calculate credit by using input data and constants
     */
    private static void calculate() {

        double amount = getAmount();
        int months = getMonths();

        double delta = amount * PERCENT / 100;
        double total = amount + months * delta;
        double perMonth = total / months;
        System.out.printf("Total price for %d month: %.2f (%.2f per month)\n", months, total, perMonth);
        System.out.printf("Your total extra pay: %.2f (extra: %.2f per month)\n", total - amount, delta);
        System.out.println("****************************************************");
    }

    /**
     * Get amount of money for credit with validation
     * @return amount of money
     */
    private static double getAmount() {
        double amount = 0;
        do {
            try {
                amount = getAmountInput();
            } catch (IOException | NumberFormatException ex) {
                warning("Input ONLY numbers for amount of money!");
                continue;
            }
        } while (notValid(amount));
        return amount;
    }

    /**
     * Get quantity of months for credit
     * @return quantity of months
     */
    private static int getMonths() {
        int months = 0;
        do {
            try {
                months = getMonthsInput();
            } catch (IOException | NumberFormatException e) {
                warning("Input ONLY numbers for quantity of months!");
                continue;
            }
        } while (notValid(months));
        return months;
    }

    /**
     * Get amount of money from keyboard (with validation data)
     * @return validated amount of money from keyboard
     * @throws IOException if User's input has wrong data (string, etc.)
     */
    private static double getAmountInput() throws IOException {
        double amount;
        System.out.print("Input amount of money: ");
        amount = Double.parseDouble(keyboard.readLine());
        if (notValid(amount)) {
            warning("Credit limit exceed!");
        }
        return amount;
    }

    /**
     * Get quantity of months from keyboard (with validation data)
     * @return validated quantity of months from keyboard
     * @throws IOException if User's input has wrong data (string, etc.)
     */
    private static int getMonthsInput() throws IOException {
        int months;
        System.out.print("Input quantity of months: ");
        months = Integer.parseInt(keyboard.readLine());
        if (months < MIN_MONTHS || months > MAX_MONTHS) {
            warning("Wrong quantity of months!");
        }
        return months;
    }

    /**
     * Validate amount of money
     * @param amount data from User
     * @return true if data NOT valid
     */
    private static boolean notValid(double amount) {
        return amount <= 0 || amount > CREDIT_LIMIT;
    }

    /**
     * Validate quantity of months
     * @param months data from User
     * @return true if data NOT valid
     */
    private static boolean notValid(int months) {
        return months < MIN_MONTHS || months > MAX_MONTHS;
    }
}
