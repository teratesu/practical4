package practice20;

public class Calculator {
    public static <T extends Number, U extends Number> double sum(T first, U second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T first, U second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T first, U second) {
        if (second.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return first.doubleValue() / second.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtraction(T first, U second) {
        return first.doubleValue() - second.doubleValue();
    }
}
