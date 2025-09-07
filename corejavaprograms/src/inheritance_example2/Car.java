package inheritance_example2;

public class Car {
	private int id;
	private String color;
	
	public Car(int id, String color) {
		super();
		this.id = id;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", getId()=" + getId() + ", getColor()=" + getColor()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
