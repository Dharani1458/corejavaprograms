package inheritance_example2;

public class Bike {
	private int id;
	private String name;
	
	public Bike(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
