package template;

public class Cricket extends Game {

	@Override
	protected void initialize() {
		System.out.println("Initialize Cricket game.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Start Cricket play.");
	}

	@Override
	protected void finishPlay() {
		System.out.println("Finish Cricket play.");
	}

}
