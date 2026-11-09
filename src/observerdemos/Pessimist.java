package observerdemos;

public class Pessimist implements Observer {
	@Override
	public void notifyMe(int amount) {
		System.out.println("Pessimist: There is less cognac in the bottle (" + amount + " cl)");
	}
}
