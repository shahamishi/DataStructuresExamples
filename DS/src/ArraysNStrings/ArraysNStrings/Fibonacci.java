package ArraysNStrings;


public class Fibonacci {

	
	public static void main(String[] args) {
		int number=6;
		System.out.println(fibonacci(number));
	}

	private static int fibonacci(int number) {
		if(number==1 || number==2){
			return 1;
		}
		return fibonacci(number -1) + fibonacci(number -2);
	}
	
	
}
