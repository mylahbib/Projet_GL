package Observer;

public class App {
public static void main(String[] args) {
	ObservableConcr obs = new ObservableConcr();
	ObserverImpl1 o = new ObserverImpl1();
	obs.addObserver(o);
	ObserverImpl2 o1 = new ObserverImpl2();
	obs.setEtat(6);
}
}
