package ua.com.codefire._04_methods;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DataManager {

    static void storeData(String data) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("data.txt");
        writer.append(data);
        writer.close();
    }

    static void storeData(String data, String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.append(data);
        writer.close();
    }
}
