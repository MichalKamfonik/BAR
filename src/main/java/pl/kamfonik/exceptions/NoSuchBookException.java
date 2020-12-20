package pl.kamfonik.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Book")
public class NoSuchBookException extends RuntimeException{
    public NoSuchBookException() {
        super();
    }

    public NoSuchBookException(String message) {
        super(message);
    }
}
