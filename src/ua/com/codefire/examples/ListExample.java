package ua.com.codefire.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // foreach ('while')
        for (String value : list) {
            //System.out.println(value);
        }

        // list.forEach(System.out::println);

        list.forEach(str -> {
            System.out.println(">>> " + str);
        });
    }
}

