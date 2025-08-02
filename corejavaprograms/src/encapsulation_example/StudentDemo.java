package encapsulation_example;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("Dharani");
		s1.setCourse("Java");
		System.out.println(s1);
		
		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("Mohan");
		s2.setCourse("Python");
		System.out.println(s2);
	}

}
