package Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcr implements Observable {

	List<Observer> observers = new ArrayList<>();
	private int etat;
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
	
		observers.add(o);
	}

	@Override
	public void suppObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observers){
			o.update(this);
		}
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObserver();
	}

}
