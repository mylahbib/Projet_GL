package Adapter;

public class Test {
	
	public static void main(String[] args) {
		Stantard d = new StandardImpl1();
		d.operation(7, 9);
	   System.out.println("Resultat : " + d);
	   
	   Stantard d2 = new Adapter();
	  d2.operation(7, 9);
	}

}
