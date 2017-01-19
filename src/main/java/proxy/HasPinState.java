package proxy;

public class HasPinState implements AtmState {
	private AtmMachineContext atmMachine;

	public HasPinState(AtmMachineContext atmMachine) {
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
		System.out.println("You have already entered your PIN.");
	}

	@Override
	public void requestCash(int cash) {
		if (cash > this.atmMachine.getCashAvailable()) {
			System.out.println("You don't have enough cash");
			System.out.println("Please, take your card.");
			this.atmMachine.setAtmState(atmMachine.getNoCardState());
		} else {
			System.out.println(cash + " provided by the machine.");
			this.atmMachine.setCashAvailable(atmMachine.getCashAvailable() - cash);
			
			System.out.println("Please, take your card.");
			this.atmMachine.setAtmState(atmMachine.getNoCardState());
		}
		
		if (this.atmMachine.getCashAvailable() <= 0) {
			this.atmMachine.setAtmState(atmMachine.getNoCashState());
		}

	}

}
