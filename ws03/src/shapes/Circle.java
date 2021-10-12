package shapes;

public class Circle implements Shape{
	double radius;
	double perimeter;
	
	Circle(double radius){
		if(radius>0) {
			perimeter = Math.PI * 2 * radius;
		}else {
			System.out.println("Invalid radius!");
		}
	}
	@Override	
	public String toString() {
		return String.format("This is a %s", this.getClass().getName());	
	}
}
