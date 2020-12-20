package pl.kamfonik.exceptions;

public class NoSuchBookException extends RuntimeException{
    public NoSuchBookException() {
        super();
    }

    public NoSuchBookException(String message) {
        super(message);
    }
}
