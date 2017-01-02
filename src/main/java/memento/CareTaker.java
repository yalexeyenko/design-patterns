package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> savedArticles;
	
	public CareTaker() {
		this.savedArticles = new ArrayList<>();
	}
	
	public Memento getMemento(int index) {
		return this.savedArticles.get(index);
	}
	
	public void addMemento(Memento memento) {
		this.savedArticles.add(memento);
	}
}
