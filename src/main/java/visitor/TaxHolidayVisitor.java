package visitor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TaxHolidayVisitor implements Visitor {
	DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: price with tax.");
		String result = df.format((liquorItem.getPrice() * 0.1) + liquorItem.getPrice());
		return Double.parseDouble(result);
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco item: price with tax.");
		String result = df.format((tobaccoItem.getPrice() * 0.25) + tobaccoItem.getPrice());
		return Double.parseDouble(result);
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity item: price with tax.");
		String result = df.format((necessityItem.getPrice() * 0.05) + necessityItem.getPrice());
		return Double.parseDouble(result);
	}
}
