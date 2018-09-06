package ua.com.codefire.examples;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayMe {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://dl1.cool.dj/download/17737781/dTJoVjQ4a0pVRmRaZDhWL1Q1N0RySFdmZkk2QXg4REM5dW11Z1NzTFNBT1BUTWg4U2VKQjJQaWgvRWorOFZMZGtvZ0dveUdEaVdsU2ZLZmcwWTZOeXltd3VBZGpFSkhmeVdwL00wdytrSHVGV2VKenBpSlM3dnhlQ1B3RlJaYUg/david-guetta-feat.sia-flames_(Cool.DJ).mp3");
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            BufferedInputStream bufferedInput = new BufferedInputStream(connection.getInputStream());
            Player player = new Player(bufferedInput);
            player.play();
            connection.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(PlayMe.class.getName()).severe(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(PlayMe.class.getName()).severe(ex.getMessage());
        } catch (JavaLayerException ex) {
            Logger.getLogger(PlayMe.class.getName()).severe(ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(PlayMe.class.getName()).severe(ex.getMessage());
        }
    }
}
