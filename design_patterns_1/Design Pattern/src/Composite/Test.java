package Composite;

public class Test {
public static void main(String[] args) {
	Composite racine = new Composite("Composite1");
	Composite compo1 = new Composite("Composite2");
	
	racine.add(compo1);
	
	racine.add(new Element("fichier 1"));
	racine.add(new Element("fichier 2"));
	racine.add(new Element("fichier 3"));
	racine.add(new Element("fichier 4"));
	compo1.add(new Element("fichier 5"));
	compo1.add(new Element("fichier 6"));
	
	racine.operation();
	
	
}
}
