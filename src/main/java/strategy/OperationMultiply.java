package strategy;

public class OperationMultiply implements Strategy {

	@Override
	public double doOperation(double a, double b) {
		return a * b;
	}

}
