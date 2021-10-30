
public class StarbuzzCoffee {
	
	public static void main(String args[]) {
		 Beverage b1 = new Espresso();
		 System.out.println(b1.getDescription()+" $"+b1.cost());
		 
		 b1 = new Mocha(b1);
		 //System.out.println(b1.getDescription()+" $"+b1.cost());
		 
		 b1 = new Milk(b1);
		 System.out.println(b1.getDescription()+" $"+b1.cost());
	}
}
