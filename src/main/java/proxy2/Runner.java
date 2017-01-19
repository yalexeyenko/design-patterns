package proxy2;

public class Runner {
	public static void main(String[] args) {
		Image proxyImage = new ProxyImage("image.jpg");
		
		// image will be loaded from disc
		proxyImage.display();
		
		// image will not be loaded from disc
		proxyImage.display();
	}
}
