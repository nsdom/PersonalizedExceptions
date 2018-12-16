package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	// RuntimeException - type of exception that the compiler dont forces u to treat;
	// Exception - the compiler forces u to treat this type of exception;
	// Type serializable - needs to have a version number ID: seriazable classes need can be converted to bytes(...);
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
