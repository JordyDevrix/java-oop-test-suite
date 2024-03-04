package CustomExceptionsKlas;

public class ToYoungPersonException extends Exception {

    public ToYoungPersonException() {
        super("Age cannot be lower than 0");
    }
}
