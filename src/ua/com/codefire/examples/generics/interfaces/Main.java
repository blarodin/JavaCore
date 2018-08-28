package ua.com.codefire.examples.generics.interfaces;

import ua.com.codefire.examples.generics.Person;

public class Main {

    public static void main(String[] args) {
        NumberProcessor numProcessor = new NumberProcessor();
        numProcessor.process(12345);

        StringProcessor strProcessor = new StringProcessor();
        strProcessor.process("Some data...");

        PersonProcessor processor = new PersonProcessor();
        processor.process(new Person());
        processor.process(new ExtPerson());
    }
}

class ExtPerson extends Person {

    private String social;

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }
}
