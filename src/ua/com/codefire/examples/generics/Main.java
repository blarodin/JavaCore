package ua.com.codefire.examples.generics;

public class Main {

    public static void main(String[] args) {
        DataHolder<Person> holder = new DataHolder();
        holder.setData(new Person());

        /*
        holder.setData(new Person()); // boxing to Object
        Person person = (Person) holder.getData(); // unboxing from Object
        */
        holder.getData().setName("John Doe");

        var value = holder.getData();
        System.out.println(value.getClass());

        Sample sample = new Sample();
        Object result = sample.process(12345);

        sample.process(13);

        DataHolder<? super Number> dataHolder = new DataHolder();
        dataHolder.setData(3.14);
    }
}
