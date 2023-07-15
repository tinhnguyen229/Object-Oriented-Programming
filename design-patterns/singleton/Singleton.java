package singleton;

public class Singleton {
    // cung cap thuoc tinh co kieu tra ve la Singleton
	private static Singleton uniqueInstance;
 
	private Singleton() {

    }
    
    // tao phuong thuc truy cap kieu tra ve la mot tham chieu den thuoc tinh uniqueInstance
	public static Singleton getInstance() {
        // thuc hien lazy-initialization
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}