package facade;

public class FundsChecker {
	private double funds = 0.0;

	public double getFunds() {
		return funds;
	}
	
	public void setFunds(double funds) {
		this.funds = funds;
	}

	public boolean isFoundsEnough(double withdrawSum) {
		return withdrawSum > getFunds();
	}
}
