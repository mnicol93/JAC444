package shapes;

public class Triangle implements Shape{
	double a, b, c;
	Triangle(double a, double b, double c){
		if((a + b) > c && (a + c) > b && (b + c) > a) {
			setA(a);
			setB(b);
			setC(c);
		}else {	
			throw new IllegalArgumentException("Invalid side(s)!");
		}
	}
	//Setters and getters for every side of the triangle.
	//Checking is done in the constructor.
	private void setA(double a) { this.a = a; }
	public double getA() { return this.a; }
	
	private void setB(double b) { this.b = b; }
	public double getB() { return this.b; }
	
	private void setC(double c) { this.c = c; }
	public double getC() { return this.c; }
	
	@Override	
	public String toString() {
		return String.format("%s {s1=%.1f, s2=%.1f, s3=%.1f} perimeter = %.4f\n", 
				this.getClass().getSimpleName(), getA(), getB(), getC(), getPerimeter());
	}
	@Override
	public double getPerimeter() {
		return a + b + c;
	}
}
