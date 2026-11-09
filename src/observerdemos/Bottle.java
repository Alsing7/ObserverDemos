package observerdemos;

import java.util.ArrayList;
import java.util.List;

public class Bottle implements Observable {
	private int amount;
	private final List<Observer> observers = new ArrayList<>();

	public Bottle(int amount) {
		this.amount = amount;
	}

	public void changeAmount(int i) {
		amount = i;
		notifyObservers();
	}

	public void fill() {
		changeAmount(70);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.notifyMe(amount);
		}
	}

	@Override
	public void add(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}
}
