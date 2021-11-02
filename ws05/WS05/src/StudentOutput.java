import java.io.*;
public class StudentOutput {
	public static void main(String[] args) {
		Student student = null;
		try {
			System.out.println("");
			FileInputStream fileIn = 
					new FileInputStream("./files/file.out");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			student = (Student) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("Student class not found");
			c.printStackTrace();
			return;
		}
		System.out.println(" --- Deserialized Student --- ");
		System.out.println("- Student ID: " + student.getID());
		System.out.println("- Student name: " + student.getFirstName()
				+ " " +student.getLastName());
		System.out.println("- Student courses: ");
		student.getCourses();
	}
}
