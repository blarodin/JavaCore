package ua.com.codefire.examples;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CreditCalculator {

    private static final double PERCENT = 1.9;
    private static final int MIN_MONTHS = 3;
    private static final int MAX_MONTHS = 24;
    private static double CREDIT_LIMIT = 30_000;
    private static int OPERATIONS_LIMIT = 5;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        for(;;) {
            System.out.printf("You may buy %d goods...\n", OPERATIONS_LIMIT);
            System.out.printf("Your credit limit are: %.2f\n", CREDIT_LIMIT);
            // First validation example
            double amount;
            boolean notValid;
            do {
                System.out.print("Input amount of money: ");
                amount = keyboard.nextDouble();
                notValid = amount > CREDIT_LIMIT;
                if(notValid) {
                    System.out.println("Warning: credit limit exceed!");
                }
            } while (notValid);

            if(OPERATIONS_LIMIT == 0) {
                System.out.println("Your operations limit over!");
                int code = Errors.OPERATIONS_LIMIT_EXEED;
                System.out.println("Error code: " + code);
                // continue;
                System.exit(code);
            }

            // Second validation example
            int months;
            while(true) {
                System.out.print("Input quantity of months: ");
                months = keyboard.nextInt();
                if(months < MIN_MONTHS || months > MAX_MONTHS) {
                    System.out.println("Warning: wrong quantity of months!");
                    continue;
                }
                break;
            }

            double delta = amount * PERCENT / 100;
            double total = amount + months * delta;
            double perMonth = total / months;
            // System.setOut(new PrintStream("result.txt")); // forward output data (Console) into file
            System.out.printf("Total price for %d month: %.2f (%.2f per month)\n", months, total, perMonth);
            System.out.printf("Your total extra pay: %.2f (%.2f per month)\n", total - amount, delta);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            CREDIT_LIMIT -= perMonth; // decrease limit by first payment
            OPERATIONS_LIMIT--;
        }
    }
}
