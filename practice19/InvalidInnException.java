package practice19;

public class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }

    public InvalidInnException(String message, Throwable cause) {
        super(message, cause);
    }
}
