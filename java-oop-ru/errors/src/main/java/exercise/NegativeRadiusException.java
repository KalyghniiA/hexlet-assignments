package exercise;

// BEGIN
public class NegativeRadiusException extends Exception{
    private static String message;

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
// END
