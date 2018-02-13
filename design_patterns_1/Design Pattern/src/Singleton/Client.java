package Singleton;

public class Client {
	public Client() {
		useSingleton();
	}

	public void useSingleton() { // Singleton s = new Singleton(); impossible
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("Premier Singleton : " + s1);
		s1.compter(5);
		System.out.println();
		System.out.println("2eme Singleton : " + s2);
		s2.compter(6);
	}

	public static void main(String[] args) {
		new Client().useSingleton();
	}
}