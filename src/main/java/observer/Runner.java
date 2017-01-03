package observer;

public class Runner {
	public static void main(String[] args) {
		AbstractStock appleStock = new Apple();
		AbstractStock ibmStock = new Ibm();
		AbstractStock microsoftStock = new Microsoft();
		
		Observer mobileObserver = new MobileObserver();
		Observer displayBoardObserver = new DisplayBoardObserver();
		
		appleStock.addObserver(mobileObserver);
		appleStock.addObserver(displayBoardObserver);
		
		ibmStock.addObserver(mobileObserver);
		ibmStock.addObserver(displayBoardObserver);
		
		microsoftStock.addObserver(mobileObserver);
		microsoftStock.addObserver(displayBoardObserver);
		
		int aPrice = 10;
		int iPrice = 20;
		int mPrice = 30;
		
		for (int i = 0; i < 5; i++) {
			appleStock.updatePrice(aPrice++);
			ibmStock.updatePrice(iPrice++);
			microsoftStock.updatePrice(mPrice++);
		}
		
		System.out.println("-------------------------");
		
		appleStock.removeObserver(displayBoardObserver);
		ibmStock.removeObserver(displayBoardObserver);
		microsoftStock.removeObserver(displayBoardObserver);
		
		for (int i = 0; i < 5; i++) {
			appleStock.updatePrice(aPrice++);
			ibmStock.updatePrice(iPrice++);
			microsoftStock.updatePrice(mPrice++);
		}
	}
}
