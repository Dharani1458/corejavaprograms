package hierarchicalinheritance;

public class ShoppingMallDemo {
	    public static void main(String[] args) {
	        
	        ClothingStore clothingStore = new ClothingStore("Super Mall", "Downtown", "Nike", 200);
	        FoodCourt foodCourt = new FoodCourt("Super Mall", "Downtown", "Indian Cuisine", 150);
	        ElectronicsStore electronicsStore = new ElectronicsStore("Super Mall", "Downtown", "Samsung", true);

	     
	        System.out.println("Clothing Store Details:");
	        clothingStore.displayClothingStoreDetails();
	        System.out.println("\nFood Court Details:");
	        foodCourt.displayFoodCourtDetails();
	        System.out.println("\nElectronics Store Details:");
	        electronicsStore.displayElectronicsStoreDetails();
	    }
	}



