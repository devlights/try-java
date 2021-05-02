package com.github.devlights.tryjava.exceptions;

public final class ExampleFailedException extends Exception {
    private static final long serialVersionUID = 1L;

    public ExampleFailedException(String message) {
        super(message);
    }

    public ExampleFailedException(Throwable cause) {
        super(cause);
    }

    public ExampleFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
