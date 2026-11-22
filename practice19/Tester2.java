package practice19;

import java.util.Comparator;
import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager(10);
        manager.add(new Student("Иванов Иван Иванович", "КВБО-11-25", 4.5));
        manager.add(new Student("Петров Пётр Петрович", "КВБО-11-25", 4.8));
        manager.add(new Student("Сидорова Анна Сергеевна", "КВБО-11-25", 4.2));
        manager.add(new Student("Козлов Дмитрий Андреевич", "КВБО-11-25", 4.7));

        @SuppressWarnings("unchecked")
        Comparator<Student>[] comparators = new Comparator[]{new SortByName(), new SortByGpa()};

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("1 — вывести список студентов");
            System.out.println("2 — отсортировать по ФИО");
            System.out.println("3 — отсортировать по среднему баллу");
            System.out.println("4 — найти студента по ФИО");
            System.out.println("0 — выход");
            System.out.print("Выберите пункт: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    manager.printAll();
                    break;
                case 2:
                    manager.sort(comparators[0]);
                    System.out.println("Список отсортирован по ФИО:");
                    manager.printAll();
                    break;
                case 3:
                    manager.sort(comparators[1]);
                    System.out.println("Список отсортирован по среднему баллу:");
                    manager.printAll();
                    break;
                case 4:
                    System.out.print("Введите ФИО: ");
                    String fullName = scanner.nextLine();
                    try {
                        System.out.println("Найден: " + manager.findByName(fullName));
                    } catch (NoSuchStudentException e) {
                        System.out.println("Ошибка поиска: " + e.getMessage());
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Нет такого пункта меню.");
            }
        }
        scanner.close();
    }
}
