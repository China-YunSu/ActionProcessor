package man.kuke.action.core.factory.annotation;

public class NoSuchActionException extends RuntimeException{
    private static final long serialVersionUID = 5359849124946247152L;

    public NoSuchActionException() {
        super();
    }

    public NoSuchActionException(String message) {
        super(message);
    }

    public NoSuchActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchActionException(Throwable cause) {
        super(cause);
    }

    protected NoSuchActionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
