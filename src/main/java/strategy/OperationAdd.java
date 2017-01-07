package strategy;

public class OperationAdd implements Strategy {

	@Override
	public double doOperation(double a, double b) {
		return a + b;
	}

}
