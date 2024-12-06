package io.github.ieu.jst;

public class JstServerException extends JstException {
    public JstServerException() {
        super();
    }

    public JstServerException(String message) {
        super(message);
    }

    public JstServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public JstServerException(Throwable cause) {
        super(cause);
    }

    protected JstServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
