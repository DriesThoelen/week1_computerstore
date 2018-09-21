package be.pxl.computerstore.util;

public class TooManyPeripheralsException extends Exception {
    public TooManyPeripheralsException() {
    }

    public TooManyPeripheralsException(String message) {
        super(message);
    }

    public TooManyPeripheralsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyPeripheralsException(Throwable cause) {
        super(cause);
    }

    public TooManyPeripheralsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
