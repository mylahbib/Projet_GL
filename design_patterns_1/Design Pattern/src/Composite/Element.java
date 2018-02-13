package Composite;

public class Element extends Composant {

	public Element(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation( ) {
		// TODO Auto-generated method stub
		String tab="";
		for(int i=0;i<niveau;i++) tab+="----";
		System.out.println(tab+ "Element : " + nom);
		
	}

}
