package facade;

public class AccountNumberChecker {
	private int accountNumber = 12345678;

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean isAccountRegistered(int accountNumber) {
		if (getAccountNumber() == accountNumber) {
			return true;
		} else {
			return false;
		}
	}
}
