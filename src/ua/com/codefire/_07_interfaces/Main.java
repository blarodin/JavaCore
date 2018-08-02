package ua.com.codefire._07_interfaces;

import java.util.Scanner;

public class Main {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        DBConnector connector;
        for (; ; ) {
            System.out.println("Select database:");
            System.out.println("1. MySQL");
            System.out.println("2. Sqlite");
            System.out.println("0. Exit");
            System.out.print("Your selection: ");

            String selection = keyboard.nextLine();
            switch (selection) {
                case "1":
                    connector = new MySQLConnector();
                    break;
                case "2":
                    connector = new SqliteConnector();
                    break;
                case "0":
                    System.exit(0);
                default:
                    delim();
                    System.out.println("Wrong selection!");
                    delim();
                    continue; // stop current iteration and run next
            }

            delim();
            if(connector instanceof Checkable) {
                System.out.println("Check the internet connection...");
            }
            connector.init();
            connector.connect();
            connector.disconnect();
            delim();
        }
    }

    private static void delim() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
