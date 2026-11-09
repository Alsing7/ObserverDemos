package observerdemos.javautil;

public class PriceMain {
	public static void main(String[] args) {
		Product product = new Product(100);
		Customer anna = new Customer("Anna");
		Customer bo = new Customer("Bo");

		product.addObserver(anna);
		product.addObserver(bo);
		product.setPrice(80);

		product.deleteObserver(bo);
		product.setPrice(60);
	}
}
