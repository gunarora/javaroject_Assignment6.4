package javaroject_Assignment6; //Package declaration is mandatory

@SuppressWarnings("serial")		
//Exception class
public class BankATMException extends RuntimeException {		
	//Declare variables
	private String message;		
	//Constructors with parameters 
	public BankATMException(String message) {							
        this.message = message;}										
	public BankATMException(Throwable cause, String message) {			
        super(cause);													
        this.message = message;}	
	//Method for message
	public String getMessage() {										
        return message;}                                               
}
