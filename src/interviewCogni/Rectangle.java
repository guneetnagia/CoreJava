package interviewCogni;

public final class Rectangle {

	private final Integer width;
	private final Integer height;
	private final Coordinates coordinates;
	
	
	
	public Rectangle(Coordinates coordinates, Integer w, Integer h){
		this.coordinates = coordinates;
		this.width = w;
		this.height = h;
		coordinates.getX();
		
	}

	// no setters only getter

	
	
	public Boolean isOvverridden(Rectangle obj){
	
		
		return false;
	}
	
	

	public Integer getWidth() {
		return width;
	}

	public Integer getHeight() {
		return height;
	}

	public static void main(String aaa[]){
		
		Coordinates c1 = new Coordinates(1, 1);
		c1.setX(12);
		Coordinates c2 = new Coordinates(2, 2);
		Rectangle r1 = new Rectangle(c1,10,10);
		Rectangle r2 = new Rectangle(c2,10,10);
	}
}
