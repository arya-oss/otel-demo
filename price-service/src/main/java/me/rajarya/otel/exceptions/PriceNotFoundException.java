package me.rajarya.otel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Product not found", code = HttpStatus.NOT_FOUND)
public class PriceNotFoundException extends RuntimeException {
    public PriceNotFoundException(String message) {
        super(message);
    }
}
