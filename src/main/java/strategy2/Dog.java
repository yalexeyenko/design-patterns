package strategy2;

public class Dog extends Animal {
	public Dog() {
		super();
		setFlight(new CannotFly());
	}
}
