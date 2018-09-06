package ua.com.codefire._09_object;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        /*
        int a = 5, b = 10;
        if(a == b) {
            System.out.println("Some action!");
        }
        */

        // Shallow copy!!!
        Object obj_1 = new Object();
        Object obj_2 = obj_1;
        if(obj_1 == obj_2) {
            System.out.println("Same Object!");
        }

        Book first = new Book("JavaSE", 850);
        Book second = new Book("JavaSE", 850);

        if(first == second) {
            System.out.println("Same Book!");
        }

        if(first.equals(second)) {
            System.out.println("Same Book!");
        }

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        System.out.println(first); // first.toString()
        System.out.println(first.getName());
        System.out.println(first.getPages());

        out.println("");

        Object obj = new Object();
        System.out.println(obj); // obj.toString()

        // Reflection API
        Class metaClass = first.getClass();

        System.out.println();
        Field[] declaredFields = metaClass.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println(field.getType());
        }
        System.out.println();

        Method[] declaredMethods = metaClass.getDeclaredMethods();
        for(Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println();

        // Call method from instance by using Reflection API
        Method method = metaClass.getDeclaredMethod("getName");
        String value = method.invoke(first).toString();
        System.out.println(value);

        Person person = new Person();
        person.setName("Ivan");
        person.setAge(21);
        System.out.println(person);
    }
}
