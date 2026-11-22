package practice18;

public class Tester7 {
    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();
        try {
            demo.getKey();
        } catch (Exception e) {
            System.out.println("Исключение поймано в main: " + e.getMessage());
        }
    }
}
