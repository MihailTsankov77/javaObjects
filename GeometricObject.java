package Exercise;

public class GeometricObject {
	private int sides;

	public GeometricObject(int _sides) {
		this.setSides( _sides);
	}
	
	public int getSides() {
		return sides;
	}

	private void setSides(int sides) {
		this.sides = sides;
	}
}
