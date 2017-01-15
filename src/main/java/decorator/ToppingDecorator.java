package decorator;

public abstract class ToppingDecorator implements Pizza {
	private Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
}
