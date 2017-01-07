package strategy2;

public class Runner {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		dog.tryToFly();
		bird.tryToFly();
		
		dog.setFlight(new CanFly());
		dog.tryToFly();
	}

}
