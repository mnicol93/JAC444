import java.io.*;
import java.util.ArrayList;
public class StudentInput {

	public static void main(String[] args) {
		String studentLine="";
		Student student = null;
		int id=0, count=0;
		String fName="", lName="";
		ArrayList<String> courseList = new ArrayList<String>();
		try {
			System.out.println("Please, introduce Student id, name, last "
					+ "name and courses.\nPress enter after every field, "
					+ "and press enter again when finished:");
			BufferedReader studentBuffer = 
					new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fileOut = 
					new FileOutputStream("./files/file.out");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			while((studentLine = studentBuffer.readLine()).length()!=0) {
				if(count == 0) {
					try {
						id = Integer.parseInt(studentLine);
						count++;
					}catch(NumberFormatException ex) {
						ex.printStackTrace();
					}
				}else if(count == 1) {
					fName = studentLine;
					count++;
				}else if(count == 2) {
					lName = studentLine;
					count++;
				}else {
					courseList.add(studentLine);
					count++;
				}
			} 
			//If the count is higher than 2 the Student object is valid.
			//Otherwise, create default Student.
			if(count > 2)
				student = new Student(id, fName, lName, courseList);
			else
				student = new Student();
			
			out.writeObject(student);
			out.flush();
			out.close();
			fileOut.close();
			
			System.out.println("Writing process finished. Output file: \"file.out\"");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
