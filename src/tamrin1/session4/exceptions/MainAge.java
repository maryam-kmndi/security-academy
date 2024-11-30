package tamrin1.session4.exceptions;

public class MainAge {

	public static void main(String[] args) {
		try {
			AgeValidator.isAgeValid(12);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
