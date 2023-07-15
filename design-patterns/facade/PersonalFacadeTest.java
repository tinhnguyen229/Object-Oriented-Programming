package facade;

public class PersonalFacadeTest {
    public static void main(String[] args) {
        Name name = new Name("Nguyen", "Ngoc", "Tinh");
        Address address = new Address("Hung Ha", "Thai Binh", "Viet Nam");
        PhoneNumber phoneNumber = new PhoneNumber("0362xxxxxx", "034xxxxxxxxx");

        PersonalFacade personal = new PersonalFacade(name, address, phoneNumber);
        personal.display();

        PersonalFacade personal1 = new PersonalFacade();
        personal1.setInformation(name, address, phoneNumber);
        personal1.display();
    }
}
