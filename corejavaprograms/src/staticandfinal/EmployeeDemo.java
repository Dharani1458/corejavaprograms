package staticandfinal;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setEid(101);
		e1.setEname("Raja");
		
		Employee.setCompany_name("TNSIF");
		
		e2.setEid(102);
		e2.setEname("Priya");
		
		Employee.setCompany_name("SMVEC");
		
		System.out.println(e1);
		System.out.println(e2);
	}
		

	}
