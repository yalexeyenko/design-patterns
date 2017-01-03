package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStock implements Subject {
	private List<Observer> observers;
	private String name;
	private int price;

	public AbstractStock() {
		super();
		observers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void updatePrice(int price) {
		this.price = price;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer newObserver) {
		this.observers.add(newObserver);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
