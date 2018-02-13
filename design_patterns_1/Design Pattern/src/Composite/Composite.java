package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {

	public Composite(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	List<Composant> composants = new ArrayList<Composant>();

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		String tab = "";
		for (int i = 0; i < niveau; i++)
			tab += "----";
		System.out.println("Composite : " + nom);
		for (Composant c : composants) {
			c.operation();
		}
	}

	public void add(Composant c) {
		c.niveau = this.niveau + 1;
		composants.add(c);
	}

	public void delete(Composant c) {
		composants.remove(c);
	}

	public List<Composant> getChild() {
		return composants;
	}

}
