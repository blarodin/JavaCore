package ua.com.codefire._14_io_adv;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("/output.txt"))){
            writer.println("Hello World!");
            writer.println("Hello Again!");
            writer.println("Simple data...");
            writer.print("blah-blah-blah...");
        } catch (FileNotFoundException | SecurityException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Operation completed!");
        }

        String fileName = "data.bin";

        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));
            outputStream.writeUTF("Hello World!");
            outputStream.writeChar('A');
            outputStream.writeDouble(3.14);
            outputStream.writeBoolean(true);
            outputStream.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readBoolean());
            inputStream.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {
            randomAccessFile.seek(6);
            //System.out.println((char)randomAccessFile.read());
            //randomAccessFile.writeUTF("My Dear Friends");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
