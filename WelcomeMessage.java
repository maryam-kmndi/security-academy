package ir.isc.exercise;

public class WelcomeMessage {

	public static void main(String[] args) {
		//Switch-case statement
		String name1 = "Mary";
		switch (name1) {
		case "Mary", "Zahra", "Fateme":
			System.out.println("Welcome woman!");
			break;
		case "Ali", "Reza", "Amir":
			System.out.println("Welcome man!");
		break;

		default:
			System.out.println("Who are you?!");
			break;
		}
		
		//Switch-case arrow syntax
		String name2 = "Amir";
		String message = switch (name2) {
		case "Mary", "Zahra", "Fateme" -> "Welcome woman!";
		case "Ali", "Reza", "Amir" -> "Welcome man!";
		default -> "Who are you?!";
		};
		System.out.println(message);
	}

}
