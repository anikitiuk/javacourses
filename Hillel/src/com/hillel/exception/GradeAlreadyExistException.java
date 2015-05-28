package com.hillel.exception;

/**
 * Created by ANikitiuk on 28.05.2015.
 */
public class GradeAlreadyExistException extends RuntimeException {
    public GradeAlreadyExistException(String message) {
        super(message);
    }
}
