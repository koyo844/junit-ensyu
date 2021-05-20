package junit.tutorial.ex02.e05;

public class ConsumptionTax {

	private static int rate;
	
	public ConsumptionTax(int rate) {
		this.rate = rate;
	}
	
	public static int apply(int price) {		
		return price + (price * rate/100);
	}
}
