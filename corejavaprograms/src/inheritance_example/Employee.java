package inheritance_example;

public class Employee extends Person {
     private int eid;
     private String designation;
     private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id2, String name2, String city2, int eid, String designation, double salary) {
		super(id2, name2, city2);
		this.eid = eid;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", designation=" + designation + ", salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
     
}
