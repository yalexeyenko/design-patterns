package observer;

public interface Subject {
	void addObserver(Observer newObserver);
	void removeObserver(Observer observer);
	void notifyObservers();
}
