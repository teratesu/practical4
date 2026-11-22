package practice20;

public class Tester4 {
    public static void main(String[] args) {
        Integer[] integers = {5, 2, 9, 1, 7};
        Double[] doubles = {2.5, 0.5, 3.7};

        MinMax<Integer> integerMinMax = new MinMax<>(integers);
        System.out.println("Массив Integer: минимум = " + integerMinMax.min()
                + ", максимум = " + integerMinMax.max());

        MinMax<Double> doubleMinMax = new MinMax<>(doubles);
        System.out.println("Массив Double: минимум = " + doubleMinMax.min()
                + ", максимум = " + doubleMinMax.max());

        System.out.println();
        System.out.println("Калькулятор с числами разных типов:");
        System.out.println("sum(5, 2.5) = " + Calculator.sum(5, 2.5));
        System.out.println("multiply(5, 2.5) = " + Calculator.multiply(5, 2.5));
        System.out.println("subtraction(5, 2.5) = " + Calculator.subtraction(5, 2.5));
        System.out.println("divide(5, 2) = " + Calculator.divide(5, 2));

        try {
            Calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("divide(5, 0): " + e.getMessage());
        }
    }
}
