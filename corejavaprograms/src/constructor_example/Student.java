package constructor_example;

public class Student {
	private int sid;
	private String sname;
	private float average;
	
	public Student() {
		this(101,"unknown",0.0f);
		System.out.println("Default constructor called");
		
	}
	public Student(int sid,String sname, float average){
		this.sid=sid;
		this.sname=sname;
		this.average=average;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", average=" + average + "]";
	}
}