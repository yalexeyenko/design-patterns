package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> shapeCache = new HashMap<>();
	
	public static Shape getShape(String type) {
		return shapeCache.get(type);
	}
	
	public static void loadShapes() {
		Shape circle = new Circle();
		Shape square = new Square();
		Shape rectangle = new Rectangle();
		
		shapeCache.put("Circle", circle);
		shapeCache.put("Square", square);
		shapeCache.put("Rectangle", rectangle);
	}
}
