package prototype;

public class Runner {
	public static void main(String[] args) {
		ShapeCache.loadShapes();
		Shape circle = ShapeCache.getShape("Circle");
		Shape square = ShapeCache.getShape("Square");
		Shape rectangle = ShapeCache.getShape("Rectangle");
		
		circle.draw();
		square.draw();
		rectangle.draw();
	}
}
