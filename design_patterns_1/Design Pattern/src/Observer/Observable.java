package Observer;

public interface Observable {
	public void addObserver(Observer o);
	public void suppObserver(Observer o);
	public void notifyObserver();
}
