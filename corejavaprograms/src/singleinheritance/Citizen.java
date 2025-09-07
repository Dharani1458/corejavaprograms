package singleinheritance;

public class Citizen {
    private String name;
    private String address;
    private String nationality;

   
    public Citizen(String name, String address, String nationality) {
        this.name = name;
        this.address = address;
        this.nationality = nationality;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

   
    public void displayCitizenDetails() {
        System.out.println("Citizen Details:");
        System.out.println("Name        : " + name);
        System.out.println("Address     : " + address);
        System.out.println("Nationality : " + nationality);
    }
}

