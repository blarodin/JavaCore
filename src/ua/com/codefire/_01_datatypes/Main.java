package ua.com.codefire._01_datatypes;

public class Main {

    public static void main(String[] args) {

        // 1. Value types (Java-primitives)

        byte b = 123;
        short s = 12345;
        int i = 12345678; // int - is a default type for numeric literal
        long l = 1234567890223L;

        float f = 0.12F;
        double d = 3.14; // double - is a default type for floating-point literal

        boolean flag = true;
        char symbol = 'A';

        // 2. Reference types (there are all other type in Java)

        Integer var = 123; // this is the same as 'Integer var = new Integer(123);'

        // Integer - is a 'wrapper' for type 'int'
        System.out.println("Integer (min): " + Integer.MIN_VALUE);
        System.out.println("Integer (max): " + Integer.MAX_VALUE);

        String strValue = "12345";
        int converted = Integer.parseInt(strValue); // convert(parse) int to String
    }
}
