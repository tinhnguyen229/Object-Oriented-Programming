package facade;

public class PersonalFacade {
    Name name;
    Address address;
    PhoneNumber phoneNumber;

    public PersonalFacade() {

    }

    public PersonalFacade(Name name, Address address, PhoneNumber phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        this.name.display();
        this.address.display();
        this.phoneNumber.display();
        System.out.println("-------------------------------------------");
    }

    public void setInformation(Name name, Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
