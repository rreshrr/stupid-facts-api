package ru.thomaskohouse.StupidFactsApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.UnknownHostException;

@ControllerAdvice
public class StupidFactHandler {

    @ExceptionHandler(UnknownHostException.class)
    public ResponseEntity<String> handleException(UnknownHostException exception) {
        return new ResponseEntity<>("Bad external service " + exception.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }

}
