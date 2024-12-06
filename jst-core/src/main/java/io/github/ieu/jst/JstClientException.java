package io.github.ieu.jst;

public class JstClientException extends JstException {
    public JstClientException() {
        super();
    }

    public JstClientException(String message) {
        super(message);
    }

    public JstClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public JstClientException(Throwable cause) {
        super(cause);
    }

    protected JstClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
