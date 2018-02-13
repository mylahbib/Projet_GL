package Factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUI g1 = new GUI(new FabriqueForme());
		GUI g2 = new GUI(new FabriqueForme());
		Forme f = g1.Commander("Carre");
	}

}
