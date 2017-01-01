package mediator;

abstract class Colleague {
	private Mediator mediator;
	private int colleagueCode;
	
	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	protected void saleOffer(String stock, int shares) {
		mediator.saleOffer(stock, shares, this.colleagueCode);
	}
	
	protected void buyOffer(String stock, int shares) {
		mediator.buyOffer(stock, shares, this.colleagueCode);
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
	
}
