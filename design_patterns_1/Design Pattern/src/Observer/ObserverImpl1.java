package Observer;

public class ObserverImpl1  implements Observer{

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub
		int etat = ((ObservableConcr) o).getEtat();
		System.out.println("R�sultat : "+ etat*3);
	}

}
