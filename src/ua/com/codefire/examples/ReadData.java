package ua.com.codefire.examples;

import java.util.Scanner;

public class ReadData {

    public static void main(String[] args) {
        int a = 10;
        Integer val = 123; // ... = new Integer(123);
        // Integer val = new Integer(123);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = keyboard.nextLine(); // app will be stop and wait for input
        System.out.print("Input your age: ");
        int age = keyboard.nextInt();

        System.out.println("Hello, " + name);
        if(age >= 18) {
            System.out.println("You are an adult person!");
        } else {
            System.out.println("You are so young...");
        }
    }
}


