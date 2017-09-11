package com.javarush.task.task22.task2201;

public class TooShortStringFirstThreadException extends RuntimeException {
    public TooShortStringFirstThreadException(Throwable cause) {
        super(cause);
    }

    public TooShortStringFirstThreadException(String message, Throwable cause) {
        super(message, cause);

    }
}
