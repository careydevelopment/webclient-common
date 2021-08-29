package us.careydevelopment.util.webclient;

/**
 * Exception returned when we encounter a problem accessing a downstream service.
 * 
 * This can be the result of 4xx or 5xx status code.
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -7661881974219233311L;

    private int statusCode;

    public ServiceException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
