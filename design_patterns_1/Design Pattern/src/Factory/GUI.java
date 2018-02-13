package Factory;

public class GUI {

	private FabriqueForme f;

	public GUI(FabriqueForme f) {

		this.f = f;
	}

	public Forme Commander(String type) {
		Forme fo = f.creerForme(type);

		fo.preparer();
		fo.typeform();

		return fo;

	}

}
