package observerdemos.javautil;

import java.util.Observable;

@SuppressWarnings("deprecation") // java.util.Observable er deprecated siden Java 9, men det er opgaven
public class Product extends Observable {
	private int price;

	public Product(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		setChanged(); // uden dette gør notifyObservers() ingenting
		notifyObservers(price);
	}
}
