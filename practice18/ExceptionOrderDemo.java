package practice18;

public class ExceptionOrderDemo {
    public static void main(String[] args) {
        String[] inputs = {"Qwerty", "0", "1"};

        System.out.println("Один общий catch (Exception):");
        for (String input : inputs) {
            System.out.println("Ввод: " + input);
            generalCatch(input);
        }

        System.out.println();
        System.out.println("Частные catch, общий catch последним:");
        for (String input : inputs) {
            System.out.println("Ввод: " + input);
            correctOrder(input);
        }
    }

    public static void generalCatch(String intString) {
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Поймано общее исключение: " + e);
        }
    }

    // catch (Exception) должен стоять последним: иначе более частные catch
    // становятся недостижимыми и программа не компилируется.
    public static void correctOrder(String intString) {
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: не целое число");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        } catch (Exception e) {
            System.out.println("Другое исключение: " + e);
        }
    }
}
