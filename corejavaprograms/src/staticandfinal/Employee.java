package staticandfinal;

public class Employee {
	private int eid;
	private String ename;
	private static String company_name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static String getCompany_name() {
		return company_name;
	}
	public static void setCompany_name(String company_name) {
		Employee.company_name = company_name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	

}
