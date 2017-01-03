package observer;

public class DisplayBoardObserver implements Observer {

	@Override
	public void update(AbstractStock stock) {
		System.out.println("DISPLAYBOARD - the price of '" + stock.getName() + "' has changed: " + stock.getPrice());		
	}

}
