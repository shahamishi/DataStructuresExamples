
public class Palindrome {

	public static void main(String[] args) {

		Integer number = new Integer(125212);

		System.out.println("The input number: " + number);

		boolean isPalindrome = isPalindrome(number);
		System.out.println("isPalindrome " + isPalindrome);
	}

	private static boolean isPalindrome(Integer inputNumber) {
		//Integer buffer = new Integer("");
		int length = inputNumber.toString().length();
		System.out.println(length);
		String inputNoInStringFormat = inputNumber.toString();
		int forwardCounter=0;
		int backwardCounter =length-1;
		while(forwardCounter <= backwardCounter){
		if(inputNoInStringFormat.charAt(forwardCounter) == inputNoInStringFormat.charAt(backwardCounter)){
			forwardCounter++;
			backwardCounter--;
		}else{
			return false;
		}
		}
		return true;
	}
}
