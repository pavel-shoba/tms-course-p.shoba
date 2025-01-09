package hometasks.lesson9.exception;

public class NumberValidationException extends RuntimeException {

    private String errorMessage;

    public NumberValidationException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
