package shapes;

public class Rectangle implements Shape {
	//public static int count = 0;
	private double height, width;
	

	public Rectangle(double width, double height) {
		if(width > 0 && height > 0) {
			this.setWidth(width);
			this.setHeight(height);

			//Rectangle.count++;
		}else {	
			if(width == height) {
				throw new IllegalArgumentException("Invalid side!");
			}
			throw new IllegalArgumentException("Invalid side(s)!");
		}
	}
	private void setWidth(double width) { this.width = width; }
	public double getWidth() { return this.width; }
	
	private void setHeight(double height) { this.height = height; }
	public double getHeight() { return this.height; }
	
	@Override	
	public String toString() {
		return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f\n", 
				this.getClass().getSimpleName(), getWidth(), getHeight(),
				getPerimeter());	
	}
	@Override
	public double getPerimeter() {
		return 2 * this.getWidth() + 2 * this.getHeight();
	}
}

