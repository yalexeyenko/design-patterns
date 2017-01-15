package decorator2;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	public void draw() {
		getShape().draw();
		setRedBorder(getShape());
	}

	private void setRedBorder(Shape shape) {
		System.out.println("Border color: red.");		
	}
	
}
