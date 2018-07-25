package ua.com.codefire._02_basicsyntax;

public class Main {

    public static void main(String[] args) {
        // 1. IF-ELSEIF-ELSE
        int a = 5, b = 10;
        if (a > 0) {
            System.out.println("Action!");
        }

        if (a == b) {
            System.out.println("Some action!");
        } else {
            System.out.println("Other action!");
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }

        // 2. SWITCH-CASE

        int param = 2;
        switch (param) {
            case 0:
                System.out.println("First action!");
                // other code may be here
                break;
            case 1:
            case 2:
                System.out.println("Other action!");
                break;
            default:
                System.out.println("Default action!");
        }

        // 3. LOOPS

        int counter = 0;
        while (counter < 10) {
            System.out.println("WHILE");
            counter++;
        }

        counter = 0;
        do {
            System.out.println("DO-WHILE");
            counter++;
        } while (counter < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("FOR");
        }

        int[] array = {5, 2, 7, 3, 9, 1};
        for(int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
