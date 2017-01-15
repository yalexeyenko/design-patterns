package decorator2;

public class Runner {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Simple circle:");
		circle.draw();
		System.out.println("Red circle:");
		redCircle.draw();
		System.out.println("Red rectangle:");
		redRectangle.draw();
	}
}
