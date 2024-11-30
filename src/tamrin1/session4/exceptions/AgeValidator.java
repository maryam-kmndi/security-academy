package tamrin1.session4.exceptions;

public class AgeValidator {
	public static void isAgeValid(int age) throws InvalidAgeException {
		if (age < 0) {
			throw new InvalidAgeException("Age can not be negative.");
		}else if (age < 18) {
			throw new InvalidAgeException("Age must be at least 18.");
		}else {
			System.out.println("Valid age.");
		}
	}
}
