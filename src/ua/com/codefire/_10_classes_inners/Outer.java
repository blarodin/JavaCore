package ua.com.codefire._10_classes_inners;

public class Outer {

    /**
     * Inner class
     */
    public class Inner {

        public void method() {
            System.out.println("Method from " + Inner.class.getName());
        }

    }

    /**
     * Nested class
     */
    public static class Nested {

        public void method() {
            System.out.println("Method from " + Inner.class.getName());
        }

    }

    /**
     * Private inner class
     */
    private class PrivateInner {

    }

    /**
     * Private inner class
     */
    private static class PrivateNested {

    }

}
