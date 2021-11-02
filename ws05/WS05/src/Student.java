import java.util.ArrayList;

public class Student implements java.io.Serializable{
	private int stdID;
	private String firstName;
	private String lastName; 
	private ArrayList<String> courses = new ArrayList<String>();
	
	Student(){
		setID(0);
		setFirstName("Unknown");
		setLastName("Unknown");
		if(courses.size() > 0) {
			courses.clear();
		}
	}
	Student(int id, String fName, String lName, ArrayList<String> courseList){
		setID(id);
		setFirstName(fName);
		setLastName(lName);
		if(courseList.size()>0) {
			for(String course : courseList) {
				courses.add(course);
			}
		}
	}
	//stdID
	public void setID(int id) { this.stdID = id; }
	public int getID() { return this.stdID; }
	//firstName
	public void setFirstName(String name) { this.firstName = name; }
	public String getFirstName() { return this.firstName; }
	//lastName
	public void setLastName(String name) { this.lastName = name; }
	public String getLastName() { return this.lastName; }
	//courses
	public void getCourses() { 
		for(String course : courses) {
			System.out.println("\t\t  - " + course);
		}
	}
}
