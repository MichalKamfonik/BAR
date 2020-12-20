package pl.kamfonik.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not complete book data")
public class BadBookRequestException extends RuntimeException{
    public BadBookRequestException() {
        super();
    }

    public BadBookRequestException(String message) {
        super(message);
    }
}
