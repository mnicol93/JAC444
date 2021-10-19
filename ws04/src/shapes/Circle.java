package shapes;

public class Circle implements Shape{
	private double radius;

	Circle(double radius){
		if(radius>0) {
			this.setRadius(radius);
		}else {	
			throw new IllegalArgumentException("Invalid radius!");
		}
	}
	private void setRadius(double radius) {	this.radius = radius; }
	public double getRadius() {
		return this.radius;
	}
	@Override	
	public String toString() {
		return String.format("%s {r=%.1f} perimeter = %.5f\n", 
				this.getClass().getSimpleName(), getRadius(), this.getPerimeter());	
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.getRadius();
	}
}
