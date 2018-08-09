package ua.com.codefire._09_object;


import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class BookUT {

    @Test
    public void testEqualsNameAndPagesInBooks() {
        System.out.println("testEqualsNameAndPagesInBooks");

        Book first = new Book("Java", 12345);
        Book second = new Book("Java", 12345);

        assertTrue(first.equals(second)); // true
    }

    @Test
    public void testNotEqualsNameInBooks() {
        System.out.println("testNotEqualsNameInBooks");

        Book first = new Book("Java", 12345);
        Book second = new Book("JavaSE", 12345);

        assertFalse(first.equals(second)); // false
    }

    @Test
    public void testNotEqualsPagesInBooks() {
        System.out.println("testNotEqualsPagesInBooks");

        Book first = new Book("Java", 12345);
        Book second = new Book("Java", 123450);

        assertFalse(first.equals(second)); // false
    }

    @Test
    //@Ignore
    public void testBooksHashCode() {
        System.out.println("testBooksHashCode");

        Book first = new Book("Java", 12345);
        Book second = new Book("Java", 12345);

        int firstHashCode = first.hashCode();
        int secondHashCode = second.hashCode();

        assertEquals(firstHashCode, secondHashCode);
    }
}
