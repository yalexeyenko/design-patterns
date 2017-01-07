package template;

public abstract class Game {
	protected abstract void initialize();
	protected abstract void startPlay();
	protected abstract void finishPlay();
	
	public void play() {
		initialize();
		startPlay();
		finishPlay();
	}
}
