package encapsulation_example;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("Dharani");
		c1.setCity("Pondicherry");
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setCname("Mithra");
		c2.setCity("Bangalore");
		System.out.println(c2);
		
		Customer c3=new Customer();
		c3.setCid(103);
		c3.setCname("Deebiga");
		c3.setCity("Chennai");
		System.out.println(c3);

	}

}
