package strategy2;

public class Animal {
	protected Flight flight;

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public void tryToFly() {
		this.flight.fly();
	}
	
}
