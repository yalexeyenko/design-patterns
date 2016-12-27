package interpreter;

public class Tons implements Expression {

	@Override
	public String tons(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String kilograms(double quantity) {
		return Double.toString(quantity * 1000);
	}

	@Override
	public String grams(double quantity) {
		return Double.toString(quantity * 1000000);
	}

	@Override
	public String milligrams(double quantity) {
		return Double.toString(quantity * 1000000000);
	}

}
