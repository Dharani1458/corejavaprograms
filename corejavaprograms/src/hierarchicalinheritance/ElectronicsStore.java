package hierarchicalinheritance;

public class ElectronicsStore extends Mall {
    private String brandName;
    private boolean offersWarranty;

    
    public ElectronicsStore(String mallName, String location, String brandName, boolean offersWarranty) {
        super(mallName, location);  
        this.brandName = brandName;
        this.offersWarranty = offersWarranty;
    }

    
    public String getBrandName() {
        return brandName;
    }

    public boolean isOffersWarranty() {
        return offersWarranty;
    }

  
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setOffersWarranty(boolean offersWarranty) {
        this.offersWarranty = offersWarranty;
    }

   
    public void displayElectronicsStoreDetails() {
        displayMallDetails(); 
        System.out.println("Brand Name       : " + brandName);
        System.out.println("Offers Warranty  : " + (offersWarranty ? "Yes" : "No"));
    }
}
