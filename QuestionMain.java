package is.isc.ex4;

public class QuestionMain {

	public static void main(String[] args) {
		Question q1 = new MultiChoiceQuestion(
				"Which is the largest continent in the world?"
				, new String[] {"Asia", "Africa", "Europe", "America"}
				, 1
		);
		
		Question q2 = new TrueFalseQuestion("The Earth is flat", 1);
	
		Question q3 = new DescriptiveQuestion("What is gravity?");
		
		
		printQuestion(q1);
		printQuestion(q2);
		printQuestion(q3);
	}
	
	 private static void printQuestion(Question q) {
	        System.out.println("Q: " + q.getQuestion());
	        String[] options = q.getOptions();
	        if (options.length > 0) {
	            for (int i = 0; i < options.length; i++) {
	                System.out.println((i + 1) + ". " + options[i]);
	            }
	        }
	        System.out.println();
	    }

}
