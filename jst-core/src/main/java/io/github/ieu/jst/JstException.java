package io.github.ieu.jst;

public class JstException extends RuntimeException {
    public JstException() {
        super();
    }

    public JstException(String message) {
        super(message);
    }

    public JstException(String message, Throwable cause) {
        super(message, cause);
    }

    public JstException(Throwable cause) {
        super(cause);
    }

    protected JstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
