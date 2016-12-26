package chainOfResponsibility;

public abstract class AbstractJuiceMachine {
	protected static final String JUICE_ERROR = "Can not make juice from ";
	protected AbstractJuiceMachine nextJuiceMachine;
	
	protected void setNextJuiceMachine(AbstractJuiceMachine juiceMachine) {
		this.nextJuiceMachine = juiceMachine;
	}
	
	public String makeJuice(String fruitName) {
		String juice;
		if (fruitName != null && fruitName.equals(getFruitName())) {
			juice = getJuice();
		} else if (nextJuiceMachine != null) {
			juice = nextJuiceMachine.makeJuice(fruitName);
		} else {
			juice = JUICE_ERROR + fruitName + "!";
		}
		return juice;
	}
	
	protected abstract String getFruitName();
	protected abstract String getJuice();
}
