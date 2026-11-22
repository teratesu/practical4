package practice21;

public class AnyArray<T> {
    private Object[] elements;
    private int size;

    public AnyArray(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            throw new IllegalStateException("Массив заполнен");
        }
        elements[size] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
