package observer;

public class MobileObserver implements Observer {
	private AbstractStock stock;

	@Override
	public void update(AbstractStock stock) {
		System.out.println("MOBILE - the price of '" + stock.getName() + "' has changed: " + stock.getPrice());
	}

}
