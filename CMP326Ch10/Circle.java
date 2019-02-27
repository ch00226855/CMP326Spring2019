
public class Circle extends Shape{
	
	private double radius;
	
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
