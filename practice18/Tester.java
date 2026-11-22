package practice18;

public class Tester {
    public static void main(String[] args) {
        Exception1 demo = new Exception1();

        System.out.println("Шаг 1: целочисленное деление на ноль без обработки");
        try {
            demo.exceptionDemo();
        } catch (ArithmeticException e) {
            System.out.println("Программа дала сбой: " + e);
        }

        System.out.println();
        System.out.println("Шаг 2: вещественное деление 2.0 / 0.0");
        demo.exceptionDemoDouble();

        System.out.println();
        System.out.println("Шаг 3: деление на ноль с блоком try-catch");
        demo.exceptionDemoCatch();
    }
}
