package facade;

public class PinCodeChecker {
	private int pinCode = 1234;

	public int getPinCode() {
		return pinCode;
	}
	
	public boolean isPinCode(int pinCode) {
		if (getPinCode() == pinCode) {
			return true;
		} else {
			return false;
		}
	}
}
