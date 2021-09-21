package models.errors;

public class EmptyStackException extends Exception{

	private static final String ERROR_EMPTY_MESSAGE = "Error: La pila está vacia.";

	public EmptyStackException(){
	     super(ERROR_EMPTY_MESSAGE);
	}
}
