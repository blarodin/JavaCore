package ua.com.codefire.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ReadAndProcess {

    public static void main(String[] args) throws Exception {

        String fileName = "https://www.gutenberg.org/files/1342/1342-0.txt";

        URL url = new URL(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "koi8-r"));

        StringBuilder builder = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }

        reader.close();

        // System.out.println(builder); // .toString()

        int lettersLimit = 3;
        Set<String> words = new TreeSet();
        String data = builder.toString();
        String delims = " -!?\n+.,:;'\"1234567890#@%$()<>*/б─°_╩©о";
        StringTokenizer tokenizer = new StringTokenizer(data, delims);
        while (tokenizer.hasMoreElements()) {
            String word = tokenizer.nextElement().toString();
            if(word.length() <= lettersLimit) {
                continue;
            }
            words.add(word.toLowerCase());
        }
        System.out.println(words.size());

        System.out.println(words);
    }
}
