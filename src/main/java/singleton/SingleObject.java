package singleton;

public class SingleObject {
	private static final SingleObject instance;
	
	static {
		instance = new SingleObject();
	}
	
	private SingleObject() {
	}
	
	public static SingleObject getInstancce() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
