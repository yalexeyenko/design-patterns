package decorator;

public class Mozarella extends ToppingDecorator {

	public Mozarella(Pizza pizza) {
		super(pizza);
		System.out.println("Adding dough");
		System.out.println("Adding mozza");
	}

	public String getDescription() {
		return getPizza().getDescription() + ", mozarella";
	}
	
	public double getCost() {
		System.out.println("Codt of mozz: " + .50);
		return getPizza().getCost() + .50;
	}
}
