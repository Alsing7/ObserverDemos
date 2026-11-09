package observerdemos;

public class Main {
	public static void main(String[] args) {
		Bottle bottle = new Bottle(70);
		Observer optimist = new Optimist();
		Observer pessimist = new Pessimist();

		bottle.add(optimist);
		bottle.add(pessimist);

		System.out.println("-- Drinker_Ib drikker --");
		bottle.changeAmount(50);
		System.out.println("-- Drinker_Ib drikker igen --");
		bottle.changeAmount(20);

		bottle.remove(pessimist);
		System.out.println("-- Pessimisten er fjernet --");
		bottle.changeAmount(5);
	}
}
