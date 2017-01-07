package template;

public class Runner {
	public static void main(String[] args) {
		Game football = new Football();
		Game cricket = new Cricket();
		
		football.play();
		cricket.play();
	}
}
