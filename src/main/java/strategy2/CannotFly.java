package strategy2;

public class CannotFly implements Flight {

	@Override
	public void fly() {
		System.out.println("I can't fly =(");
	}

}
