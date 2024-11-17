package is.isc.ex4;

public class TrueFalseQuestion implements Question{
	
	private String questionText;
	private int correctAnswerIndex;	// 0 -> true , 1 -> false
	
	public TrueFalseQuestion(String questionText, int correctAnswerIndex) {
		super();
		this.questionText = questionText;
		this.correctAnswerIndex = correctAnswerIndex;
	}

	@Override
	public String getQuestion() {
		return questionText;
	}

	String[] opt = {"True", "False"};
	
	@Override
	public String[] getOptions() {
		return opt; 
	}

	@Override
	public int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}

	
}
