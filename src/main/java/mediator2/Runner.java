package mediator2;

public class Runner {
	public static void main(String[] args) {
		User zhenya = new User("Zhenya");
		User katya = new User("Katya");

		zhenya.sendMessage("Hi everyone!");
		katya.sendMessage("Hello everyone!");
	}

}
