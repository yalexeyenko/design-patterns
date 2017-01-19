package proxy2;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying image '" + fileName + "'");		
	}
	
	private void loadImage(String fileName) {
		System.out.println("Loading image '" + fileName + "'");
	}
}
