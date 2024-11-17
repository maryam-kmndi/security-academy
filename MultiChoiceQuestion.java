package is.isc.ex4;

public class MultiChoiceQuestion implements Question{
	private String questionText;
	private String[] questionOptions;
	private int correctAnswerIndex;
	
	public MultiChoiceQuestion(String questionText, String[] questionOptions, int correctAnswerIndex) {
		super();
		this.questionText = questionText;
		this.questionOptions = questionOptions;
		this.correctAnswerIndex = correctAnswerIndex;
	}

	@Override
	public String getQuestion() {
		return questionText;
	}
	@Override
	public String[] getOptions() {
		return questionOptions;
	}

	@Override
	public int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}
	
	
}
