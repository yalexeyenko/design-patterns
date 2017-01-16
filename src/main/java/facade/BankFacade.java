package facade;

public class BankFacade {
	private int accountNumber;
	private int pinCode;

	private AccountNumberChecker accountNumberChecker;
	private PinCodeChecker pinCodeChecker;
	private FundsChecker fundsChecker;

	public BankFacade(int accountNumber, int pinCode) {
		super();
		this.accountNumber = accountNumber;
		this.pinCode = pinCode;
		this.accountNumberChecker = new AccountNumberChecker();
		this.pinCodeChecker = new PinCodeChecker();
		this.fundsChecker = new FundsChecker();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getPinCode() {
		return pinCode;
	}
	
	public AccountNumberChecker getAccountNumberChecker() {
		return accountNumberChecker;
	}

	public PinCodeChecker getPinCodeChecker() {
		return pinCodeChecker;
	}

	public FundsChecker getFundsChecker() {
		return fundsChecker;
	}

	public boolean withdraw(double withdrawSum) {
		if (getFundsChecker().isFoundsEnough(withdrawSum)) {
			System.out.println("Not enough money to withdraw.");
			return false;
		}
		System.out.println(withdrawSum + " has been withdrawn.");
		getFundsChecker().setFunds(getFundsChecker().getFunds() - withdrawSum);
		return true;
	}
	
	public boolean deposit(double depositSum) {
		System.out.println(depositSum + " has been deposited.");
		getFundsChecker().setFunds(getFundsChecker().getFunds() + depositSum);
		return true;
	}

	public void showBalance() {
		System.out.println("Balance: " + getFundsChecker().getFunds());
	}
	
}
