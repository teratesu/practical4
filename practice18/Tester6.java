package practice18;

public class Tester6 {
    public static void main(String[] args) {
        ThrowsDemo6 demo = new ThrowsDemo6();

        System.out.println("Вызов printMessage(null):");
        demo.printMessage(null);

        System.out.println();
        System.out.println("Вызов printMessage(\"key\"):");
        demo.printMessage("key");
    }
}
