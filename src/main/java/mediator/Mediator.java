package mediator;

public interface Mediator {
	void saleOffer(String stock, int shares, int colleageCode);
	void buyOffer(String stock, int shares, int colleageCode);
	void addColleague(Colleague colleague);
	void getStockOfferings();
}
