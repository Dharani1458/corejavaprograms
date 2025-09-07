package singleinheritance;

public class SlinheritanceDemo {
	    public static void main(String[] args) {
	        
	        Student student = new Student("Karthik", "Chennai", "Indian", 101, "Computer Science");

	     
	        student.displayStudentDetails();

	       
	        System.out.println("\nAccessing values using getters:");
	        System.out.println("Name   : " + student.getName());
	        System.out.println("Course : " + student.getCourse());
	    }
	}


