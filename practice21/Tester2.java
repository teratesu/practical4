package practice21;

public class Tester2 {
    public static void main(String[] args) {
        AnyArray<Integer> integers = new AnyArray<>(5);
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.print("Integer: ");
        integers.printAll();

        AnyArray<Long> longs = new AnyArray<>(3);
        longs.add(1_000_000_000L);
        longs.add(2_000_000_000L);
        System.out.print("Long: ");
        longs.printAll();

        AnyArray<String> strings = new AnyArray<>(3);
        strings.add("один");
        strings.add("два");
        System.out.print("String: ");
        strings.printAll();

        AnyArray<Double> doubles = new AnyArray<>(2);
        doubles.add(1.5);
        doubles.add(2.5);
        System.out.print("Double: ");
        doubles.printAll();

        System.out.println("Элемент с индексом 1: " + integers.get(1));
    }
}
