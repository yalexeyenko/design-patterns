package state;

public class Runner {
	public static void main(String[] args) {
		AtmMachineContext machine = new AtmMachineContext();
		
		machine.insertCard();
		machine.ejectCard();
		machine.insertCard();
		machine.enterPin(1234);
		machine.requestCash(2000);
		machine.insertCard();
		machine.ejectCard();
		machine.enterPin(1234);
	}
}
