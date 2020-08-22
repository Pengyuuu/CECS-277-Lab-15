import java.text.DecimalFormat;

public class ShoppingCartVisitImplementation implements ShoppingCartVisitor {
	
	DecimalFormat df = new DecimalFormat("0.00");

	public ShoppingCartVisitImplementation() {
		
	}
	
	public double visit(Fruit fruitItem) {
		
		System.out.print(fruitItem.getName() + " unit price " + fruitItem.getPrice() + " amount " + fruitItem.getAmount() + " cost = ");
		return Double.parseDouble(df.format(fruitItem.getAmount() * fruitItem.getPrice()));
	}
	
	public double visit (Magazine magazineItem) {
		
		System.out.print("Magainze::" + magazineItem.getTitle() + " " + magazineItem.getVdate() + " cost = ");
		
		if (magazineItem.getPrice() > 5.00) {
			
			return Double.parseDouble(df.format(magazineItem.getPrice() - (magazineItem.getPrice() * .1)));
		}
		else {
			
			return Double.parseDouble(df.format(magazineItem.getPrice()));
		}
	}
}
