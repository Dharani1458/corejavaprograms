package hierarchicalinheritance;

public class Mall {
    private String mallName;
    private String location;

   
    public Mall(String mallName, String location) {
        this.mallName = mallName;
        this.location = location;
    }

   
    public String getMallName() {
        return mallName;
    }

    public String getLocation() {
        return location;
    }

   
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

  
    public void displayMallDetails() {
        System.out.println("Mall Name   : " + mallName);
        System.out.println("Location    : " + location);
    }
}
