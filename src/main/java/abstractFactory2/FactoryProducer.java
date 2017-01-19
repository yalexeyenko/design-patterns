package abstractFactory2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if ("shape".equals(choice)) {
			return new ShapeFactory();
		} else if ("color".equals(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
