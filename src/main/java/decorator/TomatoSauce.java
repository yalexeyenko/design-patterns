package decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding sauce");
	}

	public String getDescription() {
		return getPizza().getDescription() + ", tomato sauce";
	}
	
	public double getCost() {
		System.out.println("Cost of tomato sauce: " + .35);
		return getPizza().getCost() + .35;
	}
}
