package Observer;

public class ObserverImpl2  implements Observer{

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		int etat = ((ObservableConcr) o).getEtat();
		System.out.println("Résultat : "+ etat*6);
	}

}
