package Factory;

public class FabriqueForme implements FactorySimple {

	@Override
	public Forme creerForme(String type) {
		// TODO Auto-generated method stub
		Forme f = null;
		if (type.equals("Cercle")) {
			f = new Cercle();
		} else if (type.equals("Carre")) {
			f = new Carre();
		}
		return f;
	}


}
