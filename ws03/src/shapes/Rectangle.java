package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Rectangle implements Shape {
	public static int count = 0;
	double height;
	double width;
	double perimeter;
	@Override	
	public String toString() {
		return String.format("This is a %s", this.getClass().getName());	
	}
	
	public Rectangle(double width, double height) {
		if(width > 0 && height > 0) {
			this.width = width;
			this.height = height;
			
			perimeter = 2 * width + 2 * height;
			Rectangle.count++;
		}else {
			if(width == height) {
				System.out.println("Invalid side!");
			}else {
				System.out.println("Invalid side(s)!");
			}
		}
	}
	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		}else {
			System.out.println("Width is negative.");
		}
	}
	public double getWidth() {
		return this.width;
	}
	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		}else {
			System.out.println("Height is negative.");
		}
	}
	public double getHeight() {
		return this.height;
	}
	public static void main(String args[]) {
		String s = "";
		String fileName = "shapes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				if(tokens[0] == "Rectangle") {
					
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

