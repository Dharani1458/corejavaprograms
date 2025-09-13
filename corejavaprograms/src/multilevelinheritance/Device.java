package multilevelinheritance;

public class Device {
    private String brand;
    private double price;

   
    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

   
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public void displayDeviceDetails() {
        System.out.println("Device Details:");
        System.out.println("Brand   : " + brand);
        System.out.println("Price   : " + price);
    }
}

