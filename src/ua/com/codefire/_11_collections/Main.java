package ua.com.codefire._11_collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Three");

        String value = list.get(1);
        System.out.println(value);

        System.out.println(list);

        // From List to Array (by using 'util' Arrays)
        String[] array = list.toArray(new String[0]);
        // System.out.println(array);
        System.out.println(Arrays.toString(array));

        // From Array to List (by using 'util' Arrays)
        List<String> data = Arrays.asList(array);

        // Create and init List by using one line of code
        List<Integer> answer = Arrays.asList(new Integer[]{1, 5, 2, 6, 5, 3, 8});
        System.out.println(answer);

        Set<Integer> set = new HashSet(answer);
        System.out.println(set);
        System.out.println("-----------------");

        System.out.println(new TreeSet(list));
        System.out.println(new HashSet(list));

        System.out.println("-----------------");

        long start = System.currentTimeMillis();

        List<String> queue = new LinkedList();
        queue.add("One");
        ((LinkedList<String>) queue).addLast("Two");
        queue.add("Three");
        ((LinkedList<String>) queue).addFirst("Zero");
        System.out.println(queue);

        // list = new ArrayList<>(1_000_000);

        long time = System.currentTimeMillis() - start;
        System.out.println("Elapsed: " + time + " ms");

    }
}
