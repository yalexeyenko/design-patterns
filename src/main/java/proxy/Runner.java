package proxy;

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

		// NEW STUFF : Proxy Design Pattern Code
		// The interface limits access to just the methods you want
		// made accessible

		GetAtmData RealAtmMachine = new AtmMachineContext();
		GetAtmData atmProxy = new AtmProxy();
		
		System.out.println("Current AtmState: " + atmProxy.getAtmState());
		System.out.println("Current cashAvailable: " + atmProxy.getCashAvaiable());
	}
}
