package guneet.DesignPattern.Factory;

public class FactoryPatternDemo {
	public static void main(String aaa[]){
		ShapeFactory sp = new ShapeFactory();
		
		// Circle
		Shape shape1 = sp.getShape("CIRCLE");
		shape1.draw();
		
		// Rectangle
		Shape shape2 = sp.getShape("SQUARE");
		shape2.draw();
		
	}
}
