package ArraysNStrings;


public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Amishi";
		System.out.println(a.substring(1)+a.charAt(0));
		System.out.println(reverseIteratively("MyName"));
		System.out.println(reverseRecursively(a+"S"));

	}
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        String temp = reverseRecursively(str.substring(1)) + str.charAt(0);
        return temp;

    }
	
	private static String reverseIteratively(String str){
		char[] charArray = str.toCharArray();
		int i=0;
		int j=charArray.length-1;
		char temp;
		while(i<j){
			temp = charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
			i++;
			j--;
		}
		return new String(charArray);
	}

	


}
