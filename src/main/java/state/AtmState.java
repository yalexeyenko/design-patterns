package state;

public interface AtmState {
	void insertCard();
	void ejectCard();
	void enterPin(int pin);
	void requestCash(int cash);
}
