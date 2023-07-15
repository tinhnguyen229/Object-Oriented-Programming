package facade;

public class PhoneNumber {
    String phoneNumber;
    String postalCode;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber, String postalCode) {
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void display() {
        System.out.println("PhoneNumber: " + this.postalCode + " " + this.phoneNumber);
    }
}