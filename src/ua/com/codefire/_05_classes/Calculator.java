package ua.com.codefire._05_classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public static double sum(double a, double b) {
        return scaled(a + b);
    }

    public static double dif(double a, double b) {
        return scaled(a - b);
    }

    public static double sub(double a, double b) {
        return scaled(a * b);
    }

    public static double div(double a, double b) {
        return scaled(a / b);
    }

    private static double scaled(double value) {
        BigDecimal decimal = new BigDecimal(value);
        decimal = decimal.setScale(2, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
}
