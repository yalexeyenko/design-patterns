package proxy;

public class NoCashState implements AtmState {
	private AtmMachineContext atmMachine;

	public NoCashState(AtmMachineContext atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Machine has run out of cash.");
		System.out.println("Your card is ejected.");
	}

	@Override
	public void ejectCard() {
		System.out.println("We don't have your card.");
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Machine has run out of cash.");
	}

	@Override
	public void requestCash(int cash) {
		System.out.println("Machine has run out of cash.");
	}

}
