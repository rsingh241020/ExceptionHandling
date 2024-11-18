package exceptionexamples;

public class MyOwnException extends Exception{
    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyOwnException(Throwable cause) {
        super(cause);
    }

    public MyOwnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
