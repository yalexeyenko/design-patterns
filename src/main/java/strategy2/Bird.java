package strategy2;

public class Bird extends Animal {
	public Bird() {
		super();
		setFlight(new CanFly());
	}
}
