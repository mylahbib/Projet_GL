package Factory;

public class Carre extends Forme{

	public Carre() {
		type = "Cercle";
	}

	@Override
	public void preparer() {
		// TODO Auto-generated method stub
		System.out.println("Carre preparer");
	}

	@Override
	public void typeform() {
		// TODO Auto-generated method stub
		System.out.println("Type Carre");
	}
	
	

}
