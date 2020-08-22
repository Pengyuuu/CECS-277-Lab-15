
public class Main {

	public static void main(String[] args) {
		
		ShoppingCartVisitImplementation cart = new ShoppingCartVisitImplementation();
		
		Magazine scientific = new Magazine("Scientific American" , "10.21", 6.00);
		Magazine popular = new Magazine("Popular Science", "11/17", 4.18);
		
		Fruit banana = new Fruit("Banana", 2, 0.95);
		Fruit apple = new Fruit("Apple", 5, 0.82);
		
		System.out.println(scientific.accept(cart));
		System.out.println(popular.accept(cart));

		System.out.println(banana.accept(cart));
		System.out.println(apple.accept(cart));

	}
}
