package ua.com.codefire.examples.generics;

import java.util.Collection;

public class Sample {

    public Sample(){

    }

    /**
     * Constructor-Generic
     * @param value
     * @param <T>
     */
    public<T> Sample(T value) {

    }

    /**
     * Method-Generic
     * @param param
     * @param <P>
     * @param <R>
     * @return
     */
    public<P, R> R process(P param) {
        return null;
    }

    /**
     * Method-Generic
     * @param list
     * @param <MyTypeOfData>
     */
    public<MyTypeOfData> void sort(MyTypeOfData list) {

    }
}
