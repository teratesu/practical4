package practice20;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T first;
    private V second;
    private K third;

    public GenericClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Класс T: " + first.getClass().getName());
        System.out.println("Класс V: " + second.getClass().getName());
        System.out.println("Класс K: " + third.getClass().getName());
    }

    public void printValues() {
        System.out.println("T = " + first);
        System.out.println("V = " + second);
        System.out.println("K = " + third);
    }
}
