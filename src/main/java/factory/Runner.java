package factory;

public class Runner {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("Circle");
		Shape square = ShapeFactory.getShape("Square");
		Shape rectangle = ShapeFactory.getShape("Rectangle");
		
		circle.draw();
		square.draw();
		rectangle.draw();
	}
}
