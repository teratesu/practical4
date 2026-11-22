package practice18;

import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
