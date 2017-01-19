package abstractFactory2;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if ("red".equals(color)) {
			return new Red();
		} else if ("green".equals(color)) {
			return new Green();
		} else if ("blue".equals(color)) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		throw new UnsupportedOperationException();
	}

}
