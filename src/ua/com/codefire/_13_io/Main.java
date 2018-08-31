package ua.com.codefire._13_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        int code = 32;
        System.out.println((char)code);
        */

        /*
        for (int code = 0; code < 65535; code++) {
            System.out.printf("%d -> %s\n", code, (char)code);
        }
        */

        /*

        String fileName = "result.txt";

        FileInputStream inputStream = new FileInputStream(fileName);
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(streamReader);

        */


        /*
        String line = reader.readLine();
        while(line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        */



        // 01. Read local file
        /*
        String fileName = "result.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        */


        String fileName = "http://lib.ru/ANEKDOTY/charmes.txt";

        URL url = new URL(fileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "koi8-r"));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();


    }
}
