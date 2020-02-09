package guneet.DesignPattern.Factory;

public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType.equals("CIRCLE")){
			return new Circle();
		}
		else if(shapeType.equals("SQUARE")){
			return new Square();
		}
		else if(shapeType.equals("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
