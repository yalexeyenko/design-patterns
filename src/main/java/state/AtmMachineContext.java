package state;

public class AtmMachineContext {
	private AtmState hasCardState;
	private AtmState noCardState;
	private AtmState hasPinState;
	private AtmState noCashState;

	private AtmState atmState;

	private int cashAvailable = 2000;
	private boolean isPinCorrect = false;

	public AtmMachineContext() {
		this.hasCardState = new HasCardState(this);
		this.noCardState = new NoCardState(this);
		this.hasPinState = new HasPinState(this);
		this.noCashState = new NoCashState(this);

		this.atmState = noCardState;

		if (cashAvailable <= 0) {
			this.atmState = noCashState;
		}
	}

	public void setAtmState(AtmState atmState) {
		this.atmState = atmState;
	}

	public boolean isPinCorrect() {
		return isPinCorrect;
	}

	public void setPinCorrect(boolean isPinCorrect) {
		this.isPinCorrect = isPinCorrect;
	}

	public void insertCard() {
		this.atmState.insertCard();
	}

	public void ejectCard() {
		this.atmState.ejectCard();
	}

	public void enterPin(int newPin) {
		this.atmState.enterPin(newPin);
	}

	public void requestCash(int cash) {
		this.atmState.requestCash(cash);
	}

	public AtmState getHasCardState() {
		return hasCardState;
	}

	public AtmState getNoCardState() {
		return noCardState;
	}

	public AtmState getHasPinState() {
		return hasPinState;
	}
	
	public AtmState getNoCashState() {
		return noCashState;
	}

	public int getCashAvailable() {
		return cashAvailable;
	}

	public void setCashAvailable(int cashAvailable) {
		this.cashAvailable = cashAvailable;
	}

}
