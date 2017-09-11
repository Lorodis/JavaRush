package com.javarush.task.task22.task2201;

public class TooShortStringSecondThreadException extends RuntimeException {
    public TooShortStringSecondThreadException(Throwable cause) {
        super(cause);
    }

    public TooShortStringSecondThreadException(String message, Throwable cause) {
        super(message, cause);
    }
}
