package ua.com.codefire.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class WordCounter {

    public static void main(String[] args) throws Exception{
        String fileName = "https://www.gutenberg.org/files/1342/1342-0.txt";

        URL url = new URL(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "koi8-r"));

        StringBuilder builder = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }

        reader.close();

        int lettersLimit = 3;
        Map<String,Integer> words = new HashMap<>();
        String data = builder.toString();
        String delims = " -!?\n+.,:;'\"1234567890#@%$()<>*/б─°_╩©о";
        StringTokenizer tokenizer = new StringTokenizer(data, delims);
        int size = 0;
        while (tokenizer.hasMoreElements()) {
            String word = tokenizer.nextElement().toString().toLowerCase();
            if(word.length() <= lettersLimit) {
                continue;
            }
            words.put(word, words.getOrDefault(word, 0) + 1);
            size++;
        }

        System.out.println(words.size());
        System.out.println(size);

        /*
        Map<String, Integer> sortedMap = words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        */

        // 1.
        /*
        Set<String> keys = words.keySet();
        for(String key : keys) {
            // System.out.printf("%s -> %s\n", key, words.get(key));
            System.out.println(key + " -> " + words.get(key));
        }
        */

        words = sortByValue(words);

        // 2.
        int letterLimit = 100;
        Set<Map.Entry<String, Integer>> entries = words.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            if(letterLimit > entry.getValue()) {
                break;
            }
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<V>) ((Map.Entry<K, V>) (o2)).getValue()).compareTo(((Map.Entry<K, V>) (o1)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();

        /*
        for (Iterator<Map.Entry<K, V>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
            result.put(entry.getKey(), entry.getValue());
        }
        */

        Iterator<Map.Entry<K, V>> iterator = list.iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
