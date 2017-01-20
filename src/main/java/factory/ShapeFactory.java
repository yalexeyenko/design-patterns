package factory;

public class ShapeFactory {
	public static Shape getShape(String type) {
		if ("Circle".equals(type)) {
			return new Circle();
		} else if ("Rectangle".equals(type)) {
			return new Rectangle();
		} else if ("Square".equals(type)) {
			return new Square();
		}
		return null;
	}
}
