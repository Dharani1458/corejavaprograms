package multilevelinheritance;

public class MobilePhone extends Device {
    private String model;
    private String operatingSystem;


    public MobilePhone(String brand, double price, String model, String operatingSystem) {
        super(brand, price);  
        this.model = model;
        this.operatingSystem = operatingSystem;
    }


    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    
    @Override
    public void displayDeviceDetails() {
        super.displayDeviceDetails(); 
        System.out.println("Model             : " + model);
        System.out.println("Operating System  : " + operatingSystem);
    }
}

