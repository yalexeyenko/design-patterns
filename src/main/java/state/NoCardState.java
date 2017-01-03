package state;

public class NoCardState implements AtmState {
	private AtmMachineContext atmMachine;

	public NoCardState(AtmMachineContext atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Please, enter your PIN.");
		this.atmMachine.setAtmState(atmMachine.getHasCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("You didn't enter your card.");
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("You have not entered your card.");
	}

	@Override
	public void requestCash(int cash) {
		System.out.println("You have not entered your card.");
	}

}
