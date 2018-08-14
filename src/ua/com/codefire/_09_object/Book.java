package ua.com.codefire._09_object;

import java.util.Objects;

public class Book {

    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        Book other = (Book)obj;

        // check String
        boolean result = this.name.equals(other.name);
        if(!result) {
            return false;
        }

        // check pages
        result  = this.pages == other.pages;
        return result;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
