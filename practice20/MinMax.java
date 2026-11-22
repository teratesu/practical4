package practice20;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) < 0) {
                result = array[i];
            }
        }
        return result;
    }

    public T max() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }
}
