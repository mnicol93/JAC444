package shapes;

public class Parallelogram extends Rectangle{
	public Parallelogram(double width, double height) {
		super(width, height);
	}
	@Override	
	public String toString() {
		return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f\n", 
				this.getClass().getSimpleName(), this.getWidth(), this.getHeight(),
				this.getPerimeter());	
	}
	@Override
	public double getPerimeter() {
		return 2 * this.getWidth() + 2 * this.getHeight();
	}
}
