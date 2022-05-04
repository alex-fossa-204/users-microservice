package by.andersen.laboratory.microservice.users.service.exception;

public class EmptyResultException extends ServiceException {

    public EmptyResultException() {
    }

    public EmptyResultException(String message) {
        super(message);
    }

    public EmptyResultException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyResultException(Throwable cause) {
        super(cause);
    }

    public EmptyResultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
