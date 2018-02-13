package Factory;

public class Cercle extends Forme{

	
	

	public Cercle() {
	type = "Cercle";
	}

	@Override
	public void preparer() {
		// TODO Auto-generated method stub
		System.out.println("Cercle preparer");
	}

	@Override
	public void typeform() {
		// TODO Auto-generated method stub
		System.out.println("Type cercle");
	}
	
	

}
