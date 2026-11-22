package practice18;

public class Tester2 {
    public static void main(String[] args) {
        String[] inputs = {"Qwerty", "0", "1.2", "1"};
        for (String input : inputs) {
            System.out.println("Ввод: " + input);
            try {
                int i = Integer.parseInt(input);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
            System.out.println();
        }

        System.out.println("Теперь с обработкой в методе exceptionDemo():");
        new Exception2().exceptionDemo();
    }
}
