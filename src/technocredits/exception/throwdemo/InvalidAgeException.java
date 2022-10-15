package technocredits.exception.throwdemo;

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException() {
		super("Age should be >= 18");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
