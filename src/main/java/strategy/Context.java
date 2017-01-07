package strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public double execute(double a, double b) {
		return this.strategy.doOperation(a, b);
	}
}
