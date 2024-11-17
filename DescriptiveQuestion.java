package is.isc.ex4;

public class DescriptiveQuestion implements Question{
	private String questionText;

	public DescriptiveQuestion(String questionText) {
		super();
		this.questionText = questionText;
	}

	@Override
	public String getQuestion() {
		return questionText;
	}
	
	String[] opt = {};	//Does not have option
	
	@Override
	public String[] getOptions() {
		return opt;
	}

	@Override
	public int getCorrectAnswerIndex() {
		return -1;	//There is no correct index
	}
}
