package br.com.luanrocha.workshopmongo.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public ObjectNotFoundException(String msg) {
	super(msg);
    }
}
