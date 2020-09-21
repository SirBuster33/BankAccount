public class InsufficientFundsException extends RuntimeException {

    private String Message;

    public InsufficientFundsException(String message){
        this.Message = message;
    }

    public InsufficientFundsException(Throwable cause, String message){
        super(cause);
        this.Message = message;
    }

    public String getMessage(String message){
        return message;
    }
}
