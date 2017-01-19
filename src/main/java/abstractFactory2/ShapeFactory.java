package abstractFactory2;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		throw new UnsupportedOperationException();
	}

	@Override
	Shape getShape(String shape) {
		if ("circle".equals(shape)) {
			return new Circle();
		} else if ("square".equals(shape)) {
			return new Square();
		} else if ("rectangle".equals(shape)) {
			return new Rectangle();
		}
		return null;
	}

}
