package designpatterns.builder;

public class InvalidPhoneNumberException extends RuntimeException{

    public InvalidPhoneNumberException() {
        super();
    }

    public InvalidPhoneNumberException(String message) {
        super(message);
    }

    public InvalidPhoneNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPhoneNumberException(Throwable cause) {
        super(cause);
    }

    protected InvalidPhoneNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
