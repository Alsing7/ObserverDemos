package observerdemos.javautil;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Customer implements Observer {
	private final String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + ": prisen er nu " + arg + " kr.");
	}
}
