package visitor;

public class Runner {
	public static void main(String[] args) {
		Visitor visitor = new TaxVisitor();
		Visitor holidayVisitor = new TaxHolidayVisitor();
		
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(20.99);
		Necessity milk = new Necessity(3.47);
		
		System.out.println("Usual prices:");
		System.out.println(vodka.accept(visitor));
		System.out.println(cigars.accept(visitor));
		System.out.println(milk.accept(visitor));
		
		System.out.println("\nHoliday prices:");
		System.out.println(vodka.accept(holidayVisitor));
		System.out.println(cigars.accept(holidayVisitor));
		System.out.println(milk.accept(holidayVisitor));
	}
}
