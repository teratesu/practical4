package practice19;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlineStore store = new OnlineStore();

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН (10 или 12 цифр): ");
        String inn = scanner.nextLine();

        Client client = new Client(fullName, inn);
        try {
            store.createOrder(client);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }
}
