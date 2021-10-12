package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Shape {
	double perimeter = 0;
	String toString();
	
	public static void main(String args[]) {
		String s = "";
		String fileName = "shapes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				switch(tokens[0]) {
				case "Circle":
					break;
				case "Square":
					break;
				case "Rectangle":
					break;
				case "Parallelogram":
					break;
				case "Triangle":
					break;
				case "Shape":
					break;
				default:
					System.out.println("No recognized shape; try Circle, Square,");
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
