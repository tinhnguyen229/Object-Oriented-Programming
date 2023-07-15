package singleton;

public class SingletonClient {
	public static void main(String[] args) {
        //Client goi doi tuong Singleton va truy cap phuong thuc getInstance()
        //Neu doi tuong Singleton nay chua duoc khoi tao lan nao thi no tien hanh tao doi tuong moi
        // Nguoc lai se tra ve Single co tu truoc
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
