package singleton;

public class Runner {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstancce();
		singleObject.showMessage();

	}

}
