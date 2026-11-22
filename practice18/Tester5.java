package practice18;

public class Tester5 {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        System.out.println("Шаг 1: вызов getDetails(null)");
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Поймано: " + e);
        }

        System.out.println();
        System.out.println("Шаг 2: обработка исключения внутри метода");
        System.out.println("Результат: " + demo.getDetailsWithCatch(null));
        System.out.println("Вызывающий код не узнал об ошибке — такой способ подходит не всегда.");

        System.out.println();
        System.out.println("Корректный ключ: " + demo.getDetails("key"));
    }
}
