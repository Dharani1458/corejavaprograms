package inheritance_example;

public class Student extends Person {
     private int sid;
     private String dept;
     private String course;
     
	public Student(int id, String name, String city, int sid, String dept, String course) {
		super (id, name, city);
		this.sid = sid;
		this.dept = dept;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", dept=" + dept + ", course=" + course + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + "]";
	}
	
}
