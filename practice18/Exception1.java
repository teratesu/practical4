package practice18;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public void exceptionDemoDouble() {
        System.out.println(2.0 / 0.0);
    }

    public void exceptionDemoCatch() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
