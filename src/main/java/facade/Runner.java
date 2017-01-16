package facade;

public class Runner {

	public static void main(String[] args) {
		BankFacade bankFacade = new BankFacade(12345678, 1234);
		
		bankFacade.deposit(500.00);
		bankFacade.withdraw(250.00);
		bankFacade.withdraw(300.00);
		bankFacade.showBalance();

	}

}
