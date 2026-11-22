package practice18;

public class ThrowsDemo {
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "данные для " + key;
    }

    public String getDetailsWithCatch(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "данные для " + key;
        } catch (NullPointerException e) {
            System.out.println("Исключение обработано внутри метода: " + e.getMessage());
            return null;
        }
    }
}
