package ua.com.codefire._08_classes_adv.example;

public class B extends A {

    private String b;

    public B(String a, String b) {
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
