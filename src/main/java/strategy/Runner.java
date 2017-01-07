package strategy;

public class Runner {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Context operation = new Context(new OperationAdd());
		System.out.printf(a + " + " + b + " = %g\n", operation.execute(a, b));
		
		operation.setStrategy(new OperationSubtract());
		System.out.printf(a + " - " + b + " = %g\n", operation.execute(a, b));
	
		operation.setStrategy(new OperationMultiply());
		System.out.printf(a + " * " + b + " = %g\n", operation.execute(a, b));
	}
}
