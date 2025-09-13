package multilevelinheritance;

public class SmartPhone extends MobilePhone {
    private int cameraResolution;  
    private boolean is5GEnabled;

 
    public SmartPhone(String brand, double price, String model, String operatingSystem, int cameraResolution, boolean is5GEnabled) {
        super(brand, price, model, operatingSystem);  
        this.cameraResolution = cameraResolution;
        this.is5GEnabled = is5GEnabled;
    }

    
    public int getCameraResolution() {
        return cameraResolution;
    }

    public boolean getIs5GEnabled() {
        return is5GEnabled;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void setIs5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
    }

  
    @Override
    public void displayDeviceDetails() {
        super.displayDeviceDetails();  
        System.out.println("Camera Resolution : " + cameraResolution + " MP");
        System.out.println("5G Enabled        : " + (is5GEnabled ? "Yes" : "No"));
    }
}
