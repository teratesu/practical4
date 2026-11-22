package practice21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"один", "два", "три"};
        Integer[] numbers = {10, 20, 30};

        List<String> stringList = toList(strings);
        List<Integer> numberList = toList(numbers);

        System.out.println("Список строк: " + stringList);
        System.out.println("Список чисел: " + numberList);

        List<String> fixedList = Arrays.asList(strings);
        System.out.println("Arrays.asList: " + fixedList);
        System.out.println("Примечание: список из Arrays.asList имеет фиксированный размер.");
    }
}
