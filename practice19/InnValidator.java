package practice19;

public class InnValidator {
    private static final int[] WEIGHTS_10 = {2, 4, 10, 3, 5, 9, 4, 6, 8};
    private static final int[] WEIGHTS_11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
    private static final int[] WEIGHTS_12 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

    public static boolean isValid(String inn) {
        if (inn == null || !inn.matches("\\d{10}|\\d{12}")) {
            return false;
        }
        if (inn.length() == 10) {
            return controlDigit(inn, WEIGHTS_10) == inn.charAt(9) - '0';
        }
        return controlDigit(inn, WEIGHTS_11) == inn.charAt(10) - '0'
                && controlDigit(inn, WEIGHTS_12) == inn.charAt(11) - '0';
    }

    private static int controlDigit(String inn, int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += (inn.charAt(i) - '0') * weights[i];
        }
        return sum % 11 % 10;
    }
}
