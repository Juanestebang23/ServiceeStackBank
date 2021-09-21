package models.errors;

public class NotFoundException extends Exception{
    
    private static final String ERROR_NOT_FOUND_MESSAGE = "Error: no se encontro el CLiente.";

    public NotFoundException(){
        super(ERROR_NOT_FOUND_MESSAGE);
    }
}
