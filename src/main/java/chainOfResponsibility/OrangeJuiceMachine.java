package chainOfResponsibility;

public class OrangeJuiceMachine extends AbstractJuiceMachine {
	private static final String NAME = "Orange";
	private static final String JUICE = "Orange juice! Yammy! =)";

	@Override
	protected String getFruitName() {
		return NAME;
	}

	@Override
	protected String getJuice() {
		return JUICE;
	}

}
