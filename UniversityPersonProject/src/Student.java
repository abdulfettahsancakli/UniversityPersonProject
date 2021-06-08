
public class Student extends UniversityPerson{
	String dept,gpa;
	public Student(String name, String surname, String id,String dept,String gpa) {
		super(name, surname, id);
		this.dept=dept;
		this.gpa=gpa;
		
	
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
}
