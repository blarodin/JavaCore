package ua.com.codefire._10_classes_inners.example;

import java.util.Objects;

public class Storage {

    public class Item {

        private String value;

        public Item() {
        }

        public Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return Objects.equals(value, item.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public String toString() {
            return "Item{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    private Item[] items; // null

    public Storage() {
        this.items = new Item[10];
    }

    public Storage(int quantity) {
        this.items = new Item[quantity];
    }


    /**
     * Add item into Storage
     * @param item unique item
     * @return 1 if item added, 0 if not added (not unique), -1 if storage is full
     */
    public int add(Item item) {
        for (int i = 0; i < items.length; i++) {
            Item current = items[i];
            // Check free place for new Item
            if(current == null){
                items[i] = item;
                return 1;
            }
            // Check unique value into Item
            if(current.equals(item)) {
                return 0;
            }
        }
        return -1;
    }
}
