package ua.com.codefire._09_object;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        /*
        int a = 5, b = 10;
        if(a == b) {
            System.out.println("Some action!");
        }
        */

        // Shallow copy!!!
        Object obj_1 = new Object();
        Object obj_2 = obj_1;
        if(obj_1 == obj_2) {
            System.out.println("Same Object!");
        }

        Book first = new Book("JavaSE", 850);
        Book second = new Book("JavaSE", 850);

        if(first == second) {
            System.out.println("Same Book!");
        }

        if(first.equals(second)) {
            System.out.println("Same Book!");
        }

        out.println("");
    }
}
