package ArraysNStrings;

public class ReverseANumber {

	public static void main(String[] args) {
		int originalNum = 12345;
		int reversedNum=reverse(originalNum);
		System.out.println("The reverse of "+originalNum+" is "+reversedNum);

	}

	private static int reverse(int originalNumber){
		int reverseNumber=0;
		
		do{
			int remainder = originalNumber%10;
			reverseNumber= (reverseNumber*10) + remainder;
			originalNumber=originalNumber-remainder;
			originalNumber/=10;
		}while(originalNumber%10 != 0);
		
		return reverseNumber; 
	}
}
