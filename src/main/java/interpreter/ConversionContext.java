package interpreter;

public class ConversionContext {
	private String conversionQuestion = "";
	private Double quantity;
	private String conversionFrom = "";
	private String conversionTo = "";
	private String conversionResponse = "";
	private String[] questionParts;
	
	public ConversionContext(String conversionQuestion) {
		this.conversionQuestion = conversionQuestion;
		setQuestionParts(getConversionQuestion());
		setConversionFrom(getQuestionParts());
		setQuantity(getQuestionParts());
		setConversionTo(getQuestionParts());
		setConversionResponse();
	}
	
	public String getConversionQuestion() {
		return this.conversionQuestion;
	}
	
	private void setQuestionParts(String conversionQuestion) {
		this.questionParts = conversionQuestion.split(" ");
	}
	
	public String[] getQuestionParts() {
		return this.questionParts;
	}
	
	private void setConversionFrom(String[] questionParts) {
		String tmp = (questionParts[1].charAt(questionParts[1].length() - 1) == ('s') ? questionParts[1] : questionParts[1] + "s").toLowerCase();
		this.conversionFrom = Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1);
	}
	
	public String getConversionFrom() {
		return this.conversionFrom;
	}
	
	private void setQuantity(String[] questionParts) {
		this.quantity = Double.valueOf(questionParts[0]);
	}
	
	public Double getQuantity() {
		return this.quantity;
	}
	
	private void setConversionTo(String[] questionParts) {
		this.conversionTo = questionParts[3];
	}
	
	public String getConversionTo() {
		return this.conversionTo;
	}
	
	private void setConversionResponse() {
		this.conversionResponse = getQuantity() + " " + getConversionFrom() + " equals ";
	}
	
	public String getConversionREsponse() {
		return this.conversionResponse;
	}
}
