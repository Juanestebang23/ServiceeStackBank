package models.errors;

public class FullStackException extends Exception{
    
    private static final String ERROR_FULL_ARRAY_MESSAGE = "Error: solo se pueden agregar tres registros.";

    public FullStackException(){
        super(ERROR_FULL_ARRAY_MESSAGE);
    }
}
