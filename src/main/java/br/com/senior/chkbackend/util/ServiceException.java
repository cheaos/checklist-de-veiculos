package br.com.senior.chkbackend.util;

public class ServiceException extends Exception  {
    private static final long serialVersionUID = 1L;

    private final ErrorCategory category;
    private final String errorCode;

    private final Object customPayload;

    public ServiceException(ErrorCategory category, String message, String errorCode, Throwable cause, Object customPayload) {
        super(message, cause);
        this.category = category;
        this.errorCode = errorCode;
        this.customPayload = customPayload;
    }

    public ServiceException(ErrorCategory category, String message, Throwable cause, Object customPayload) {
        super(message, cause);
        this.category = category;
        this.errorCode = null;
        this.customPayload = customPayload;
    }

    public ServiceException(ErrorCategory category, String message, Throwable cause) {
        this(category, message, cause, null);
    }

    public ServiceException(ErrorCategory category, String message, String errorCode) {
        this(category, message, errorCode, null);
    }

    public ServiceException(ErrorCategory category, String message, String errorCode, Throwable cause) {
        this(category, message, errorCode, cause, null);
    }

    public ServiceException(ErrorCategory category, String message) {
        this(category, message, null, null, null);
    }

    public ServiceException(ErrorCategory category, Throwable cause) {
        this(category, null, null, cause, null);
    }

    public ServiceException(ErrorCategory category, Throwable cause, Object customPayload) {
        this(category, null, null, cause, customPayload);
    }

    public ServiceException(ErrorCategory category, Object customPayload) {
        this(category, null, null, null, customPayload);
    }

    public ServiceException(ErrorCategory category) {
        this(category, null, null, null, null);
    }

    public ErrorCategory getCategory() {
        return category;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Object getCustomPayload() {
        return customPayload;
    }
}
