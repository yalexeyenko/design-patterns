package composite;

public abstract class SongComponent {
	
	public abstract void displayInfo();
	public void add(SongComponent songComponent) {
		throw new UnsupportedOperationException();
	}
}
