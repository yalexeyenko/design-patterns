package chainOfResponsibility;

public class AppleJuiceMachine extends AbstractJuiceMachine {
	private static final String NAME = "Apple";
	private static final String JUICE = "Apple juice! Yammy! =)";

	@Override
	protected String getFruitName() {
		return NAME;
	}

	@Override
	protected String getJuice() {
		return JUICE;
	}

}
