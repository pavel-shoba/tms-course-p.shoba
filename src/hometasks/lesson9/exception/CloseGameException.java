package hometasks.lesson9.exception;

public class CloseGameException extends RuntimeException {

    private String errorMessage;

    public CloseGameException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
