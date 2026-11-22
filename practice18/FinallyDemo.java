package practice18;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1) return из try и блок finally");
        System.out.println("Результат метода: " + returnFromTry());
        System.out.println();

        System.out.println("2) исключение в try и блок finally");
        try {
            throwFromTry();
        } catch (RuntimeException e) {
            System.out.println("Исключение поймано в main: " + e.getMessage());
        }
        System.out.println();

        System.out.println("3) обработка ввода с блоком finally");
        parseAndDivide("Qwerty");
        parseAndDivide("0");
        parseAndDivide("1");
    }

    public static int returnFromTry() {
        try {
            System.out.println("Выполняется try");
            return 1;
        } finally {
            System.out.println("Выполняется finally перед возвратом");
        }
    }

    public static void throwFromTry() {
        try {
            System.out.println("Выполняется try");
            throw new RuntimeException("ошибка в try");
        } finally {
            System.out.println("Выполняется finally перед пробросом");
        }
    }

    public static void parseAndDivide(String intString) {
        System.out.println("Ввод: " + intString);
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: не целое число");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        } finally {
            System.out.println("Блок finally выполнен");
        }
        System.out.println();
    }
}
