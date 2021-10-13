package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		String s = "", fileName = "shapes.txt";
		Shape[] shapes = new Shape[100];
		int count = 0;
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ...<-------");

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				switch(tokens[0]) {
				case "Circle":
					try {
						if(tokens.length == 2) {
							shapes[count] = new Circle(Double.parseDouble(tokens[1]));
							count++;
						}
					}catch(Exception err) {
						System.out.println(err.getMessage());
					}
					break;
				case "Square":
					try {
						if(tokens.length == 2) {
							shapes[count] = new Square(
								Double.parseDouble(tokens[1])
							);
							count++;
						}
					}catch(Exception err) {
						System.out.println(err.getMessage());
					}
					break;
				case "Rectangle":
					try {
						if(tokens.length == 3) {
							shapes[count] = new Rectangle(
									Double.parseDouble(tokens[1]),
									Double.parseDouble(tokens[2])
							);
							count++;
						}
					}catch(Exception err) {
						System.out.println(err.getMessage());
					}
					break;
				case "Parallelogram":
					try {
						if(tokens.length == 3) {
							shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]),
									Double.parseDouble(tokens[2]));
							count++;
						}
					}catch(Exception err) {
						System.out.println(err.getMessage());
					}
					break;
				case "Triangle":
					try {
						if(tokens.length == 4) {
							shapes[count] = new Triangle(
									Double.parseDouble(tokens[1]),
									Double.parseDouble(tokens[2]),
									Double.parseDouble(tokens[3])
							);
							count++;
						}else {
							System.out.println("Invalid side(s)!");
						}
					}catch(Exception err) {
						System.out.println(err.getMessage());
					}
					break;
				default:
					break;
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("\n%d shapes were created:\n", count);
		for(Shape shape: shapes) {
			
			if (count > 0) {
				System.out.println(shape);
				count--;
			}
		}
	}
}	
