package shapes;

public class Square extends Rectangle{
	public Square(double side) {
		super(side, side);
	}
	@Override	
	public String toString() {
		if(this.getWidth() < 0.1) {
			return String.format("%s {s=%1.1E} perimeter = %1.5e\n", 
					this.getClass().getSimpleName(), this.getWidth(), this.getPerimeter());
		}
		return String.format("%s {s=%.1f} perimeter = %.4f\n", 
				this.getClass().getSimpleName(), this.getWidth(), this.getPerimeter());
	}
	@Override
	public double getPerimeter() {
		return this.getWidth() * 4;
	}
}
