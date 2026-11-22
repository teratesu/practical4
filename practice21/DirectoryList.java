package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryList {
    public static List<String> listDirectory(String path) {
        File directory = new File(path);
        String[] names = directory.list();
        if (names == null) {
            throw new IllegalArgumentException("Каталог не найден: " + path);
        }
        return new ArrayList<>(Arrays.asList(names));
    }

    public static void main(String[] args) {
        String path = ".";
        if (args.length > 0) {
            path = args[0];
        }
        try {
            List<String> contents = listDirectory(path);
            System.out.println("Первые 5 элементов каталога " + path + ":");
            for (int i = 0; i < contents.size() && i < 5; i++) {
                System.out.println((i + 1) + ". " + contents.get(i));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
