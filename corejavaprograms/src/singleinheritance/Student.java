package singleinheritance;

public class Student extends Citizen {
	private int rollNumber;
    private String course;


	public Student(String name, String address, String nationality, int rollNumber, String course) {
	super(name, address, nationality); 
	this.rollNumber = rollNumber;
	this.course = course;
	}


	 public int getRollNumber() {
	 return rollNumber;
	 }

	 public String getCourse() {
	        return course;
	    }

	 
	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	  
	    public void displayStudentDetails() {
	        super.displayCitizenDetails(); 
	        System.out.println("Student Details:");
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Course      : " + course);
	    }
	}



