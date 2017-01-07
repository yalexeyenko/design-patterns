package strategy;

public class OperationSubtract implements Strategy {

	@Override
	public double doOperation(double a, double b) {
		return a - b;
	}

}
