package facade;

public class Address {
    String city;
    String district;
    String country;

    public Address() {
    }

    public Address(String district, String city, String country) {
        this.district = district;
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void display() {
        System.out.println("Address: " + this.district + " - " + this.city + " - " + this.country);
    }
}