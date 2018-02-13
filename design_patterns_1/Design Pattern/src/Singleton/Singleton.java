package Singleton;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
	
	
	public void compter(int n){
		System.out.println("Les valeurs sont : ");
		for(int i=0;i<=n;i++){
		
			System.out.print(" " + i);
		}
	}
}