package template;

public class Football extends Game {

	@Override
	protected void initialize() {
		System.out.println("Initialize Football game.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Start Football play.");
	}

	@Override
	protected void finishPlay() {
		System.out.println("Finish Football play.");
	}

}
