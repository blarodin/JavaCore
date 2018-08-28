package ua.com.codefire._12_map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(0, "Zero");

        String value = map.get(2); // return "Two"


    }
}
