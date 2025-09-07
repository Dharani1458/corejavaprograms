package inheritance_example2;

public class Vehicle {
	private int id;
	private String city;
	
	
	public Vehicle(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", city=" + city + ", getId()=" + getId() + ", getCity()=" + getCity()
				+ ", toString()=" + super.toString() + "]";
	}
}
	
	
	