package mediator;

public class StockOffer {
	private int sockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode;

	public StockOffer(int sockShares, String stockSymbol, int colleagueCode) {
		super();
		this.sockShares = sockShares;
		this.stockSymbol = stockSymbol;
		this.colleagueCode = colleagueCode;
	}

	public int getSockShares() {
		return sockShares;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}
	
	

}
