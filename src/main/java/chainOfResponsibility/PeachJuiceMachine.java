package chainOfResponsibility;

public class PeachJuiceMachine extends AbstractJuiceMachine {
	private static final String NAME = "Peach";
	private static final String JUICE = "Peach juice! Yammy! =)";

	@Override
	protected String getFruitName() {
		return NAME;
	}

	@Override
	protected String getJuice() {
		return JUICE;
	}

}
