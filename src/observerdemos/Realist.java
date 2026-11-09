package observerdemos;

public class Realist implements Observer {
	@Override
	public void notifyMe(int amount) {
		if (amount < 35) {
			System.out.println("Realist: There is less cognac in the bottle (" + amount + " cl)");
		} else {
			System.out.println("Realist: There is still some cognac left (" + amount + " cl)");
		}
	}
}
