package state;

public class HasCardState implements AtmState {
	private AtmMachineContext atmMachine;

	public HasCardState(AtmMachineContext atmMachine) {
		super();
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can only enter one card.");
	}

	@Override
	public void ejectCard() {
		System.out.println("Please, take your card.");
		this.atmMachine.setAtmState(atmMachine.getNoCardState());
	}

	@Override
	public void enterPin(int pin) {
		if (pin == 1234) {
			System.out.println("PIN is correct.");
			this.atmMachine.setPinCorrect(true);
			this.atmMachine.setAtmState(atmMachine.getHasPinState());
		} else {
			System.out.println("PIN is incorrect.");
			this.atmMachine.setPinCorrect(false);
			this.atmMachine.setAtmState(atmMachine.getNoCardState());
		}

	}

	@Override
	public void requestCash(int cash) {
		System.out.println("You have not entered your pin.");
	}

}
