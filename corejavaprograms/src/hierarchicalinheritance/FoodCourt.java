package hierarchicalinheritance;

public class FoodCourt extends Mall {
    private String foodType;
    private int seatingCapacity;


    public FoodCourt(String mallName, String location, String foodType, int seatingCapacity) {
        super(mallName, location);  
        this.foodType = foodType;
        this.seatingCapacity = seatingCapacity;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

   
    public void displayFoodCourtDetails() {
        displayMallDetails(); 
        System.out.println("Food Type      : " + foodType);
        System.out.println("Seating Capacity : " + seatingCapacity);
    }
}
