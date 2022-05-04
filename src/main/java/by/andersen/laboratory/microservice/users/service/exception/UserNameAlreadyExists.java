package by.andersen.laboratory.microservice.users.service.exception;

public class UserNameAlreadyExists extends ServiceException {

    public UserNameAlreadyExists() {
    }

    public UserNameAlreadyExists(String message) {
        super(message);
    }

    public UserNameAlreadyExists(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameAlreadyExists(Throwable cause) {
        super(cause);
    }

    public UserNameAlreadyExists(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
