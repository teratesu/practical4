package practice21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    @SafeVarargs
    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    @SafeVarargs
    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(K key, V value) {
        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static void main(String[] args) {
        List<String> list = newArrayList("один", "два", "три");
        System.out.println("newArrayList: " + list);

        Set<Integer> set = newHashSet(1, 2, 2, 3, 3, 3);
        System.out.println("newHashSet: " + set);
        System.out.println("Дубликаты в HashSet не сохраняются.");

        Map<String, Integer> map = newHashMap("возраст", 20);
        System.out.println("newHashMap: " + map);
    }
}
