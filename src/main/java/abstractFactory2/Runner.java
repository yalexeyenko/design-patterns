package abstractFactory2;

public class Runner {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("red");
		red.fill();
		Color green = colorFactory.getColor("green");
		green.fill();
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}
}
