package ArraysNStrings;


public class SwapNumbers {

	/**
	 * @param args
	 */
	
	static int a = 1;
	static int b= 5;
	public static void main(String[] args) {
		new SwapNumbers().swipeNumber();
		System.out.println("a: "+a +" and b: "+b);
	}
	private  void swipeNumber() {
		a= a+b;
		b= a-b;
		a= a-b;
	}
	
}
