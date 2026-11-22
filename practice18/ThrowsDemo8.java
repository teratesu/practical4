package practice18;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ключ: ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте ещё раз.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
