package practice20;

public class Tester {
    public static void main(String[] args) {
        GenericClass<String, Dog, Integer> example =
                new GenericClass<>("текст", new Dog("Бобик"), 42);
        example.printValues();
        System.out.println();
        example.printClassNames();

        System.out.println();
        System.out.println("Ограничения параметров проверяет компилятор:");
        System.out.println("T — Comparable, V — Serializable и Animal, K — Number.");
    }
}
