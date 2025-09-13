package hierarchicalinheritance;

public class ClothingStore extends Mall {
    private String clothingBrand;
    private int numOfItems;


    public ClothingStore(String mallName, String location, String clothingBrand, int numOfItems) {
        super(mallName, location); 
        this.clothingBrand = clothingBrand;
        this.numOfItems = numOfItems;
    }

    
    public String getClothingBrand() {
        return clothingBrand;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setClothingBrand(String clothingBrand) {
        this.clothingBrand = clothingBrand;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    
    public void displayClothingStoreDetails() {
        displayMallDetails(); 
        System.out.println("Clothing Brand : " + clothingBrand);
        System.out.println("Number of Items : " + numOfItems);
    }
}
