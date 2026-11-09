package observerdemos;

public interface Observable {
	// ponytail: hedder notifyAll() i UML'en, men Object.notifyAll() er final -> compile-fejl i Java
	void notifyObservers();

	void add(Observer o);

	void remove(Observer o);
}
