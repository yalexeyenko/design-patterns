package mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {

	List<Colleague> colleagues;
	List<StockOffer> buyOffers;
	List<StockOffer> saleOffers;

	int colleaguCode = 0;

	public StockMediator() {
		this.colleagues = new ArrayList<>();
		this.buyOffers = new ArrayList<>();
		this.saleOffers = new ArrayList<>();
	}

	@Override
	public void saleOffer(String stock, int shares, int colleageCode) {
		boolean isSold = false;
		for (StockOffer offer : buyOffers) {
			if ((stock.equals(offer.getStockSymbol())) && (shares == offer.getSockShares())) {
				System.out.println(shares + " shares of " + stock + " sold to colleague code " + colleageCode);
				buyOffers.remove(offer);
				isSold = true;
			}
			if (isSold) {
				break;
			}
		}
		if (!isSold) {
			System.out.println(shares + " shares of " + stock + " added to inventory");
			saleOffers.add(new StockOffer(shares, stock, colleageCode));
		}
	}

	@Override
	public void buyOffer(String stock, int shares, int colleageCode) {
		boolean isBought = false;
		for (StockOffer offer : saleOffers) {
			if ((stock.equals(offer.getStockSymbol())) && (shares == offer.getSockShares())) {
				System.out.println(shares + " shares of " + stock + " bought by colleague code " + colleageCode);
				saleOffers.remove(offer);
				isBought = true;
			}
			if (isBought) {
				break;
			}
		}
		if (!isBought) {
			System.out.println(shares + " shares of " + stock + " added to inventory");
			buyOffers.add(new StockOffer(shares, stock, colleageCode));
		}
	}

	@Override
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
		colleaguCode++;
		colleague.setColleagueCode(colleaguCode);
	}

	public void getStockOfferings() {
		System.out.println("Stock for sale:");
		for (StockOffer offer : saleOffers) {
			System.out.println(offer.getSockShares() + " of " + offer.getStockSymbol());
		}

		System.out.println("Stock buy offers:");
		for (StockOffer offer : buyOffers) {
			System.out.println(offer.getSockShares() + " of " + offer.getStockSymbol());
		}
	}

}
