package encapsulation_example;

public class ProductDemo {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setPid(101);
		p1.setPname("Lux");
		p1.setQuantity(1);
		p1.setPrice(80);
		System.out.println(p1);
		
		Product p2=new Product();
		p2.setPid(102);
		p2.setPname("Hamam");
		p2.setQuantity(2);
		p2.setPrice(70);
		System.out.println(p2);
		
		Product p3=new Product();
		p3.setPid(103);
		p3.setPname("Pears");
		p3.setQuantity(3);
		p3.setPrice(60);
		System.out.println(p3);
		
		Product p4=new Product();
		p4.setPid(104);
		p4.setPname("Himalaya");
		p4.setQuantity(4);
		p4.setPrice(50);
		System.out.println(p4);
		
		Product p5=new Product();
		p5.setPid(105);
		p5.setPname("Dettol");
		p5.setQuantity(5);
		p5.setPrice(60);
		System.out.println(p5);





	}

}
