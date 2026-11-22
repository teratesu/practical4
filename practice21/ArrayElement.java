package practice21;

public class ArrayElement {
    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException(
                    "Индекс " + index + " вне диапазона 0.." + (array.length - 1));
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] strings = {"один", "два", "три"};
        Integer[] numbers = {100, 200, 300};
        Double[] doubles = {1.5, 2.5};

        System.out.println("Строка с индексом 1: " + getElement(strings, 1));
        System.out.println("Число с индексом 0: " + getElement(numbers, 0));
        System.out.println("Double с индексом 1: " + getElement(doubles, 1));

        try {
            getElement(strings, 5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
