package mediator;

public class Runner {
	public static void main(String[] args) {
		Mediator mediator = new StockMediator();
		Colleague gormanBroker = new GormanSlacks(mediator);
		Colleague jtBroker = new JTPoorman(mediator);
		
		gormanBroker.saleOffer("MSFT", 100);
		gormanBroker.saleOffer("GOOG", 50);
		
		jtBroker.buyOffer("MSFT", 100);
		jtBroker.buyOffer("NRG", 10);
		
		gormanBroker.buyOffer("NRG", 10);
		
		mediator.getStockOfferings();
	}
}
