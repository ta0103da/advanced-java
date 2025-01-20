package exercises;

public class OperatorException extends Exception{
    
    public OperatorException(){
    }

    public OperatorException(String message){
        super(message);
    }
    public OperatorException(Throwable cause){
        super(cause);
    }
    public OperatorException(String message,Throwable cause){
        super(message,cause);
    }
}
