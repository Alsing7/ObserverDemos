package observerdemos;

public class Optimist implements Observer {
	@Override
	public void notifyMe(int amount) {
		System.out.println("Optimist: There is still some cognac left (" + amount + " cl)");
	}
}
