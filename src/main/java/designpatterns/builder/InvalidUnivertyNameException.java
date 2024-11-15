package designpatterns.builder;

public class InvalidUnivertyNameException extends RuntimeException{

    public InvalidUnivertyNameException() {
        super();
    }

    public InvalidUnivertyNameException(String message) {
        super(message);
    }

    public InvalidUnivertyNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUnivertyNameException(Throwable cause) {
        super(cause);
    }

    protected InvalidUnivertyNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
