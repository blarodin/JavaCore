package ua.com.codefire._15_logging;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("errors.log", 2048, 5);
            /*
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            */
            LOGGER.addHandler(fileHandler);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).severe(ex.getMessage());
        }
    }


    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.myexternalip.com/raw");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "windows-1251"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        } catch (IOException ex) {
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, ex.getMessage());
            // LOGGER.severe(ex.getMessage());
            Logger.getLogger(Main.class.getName()).severe(ex.getMessage());
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }
    }
}
