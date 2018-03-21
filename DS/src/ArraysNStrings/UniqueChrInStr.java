package ArraysNStrings;

import java.util.Arrays;


/**
 * This class is not allowed to use any additional Data Structure for saving the
 * unique chars in the given string.
 * 
 * @author ashah
 * 
 */
public class UniqueChrInStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//char[] str = new char[]{'1','2','3','4','5'};
		
		String str = new String("Amish");
		
		System.out.println(isStringUnique(str));
		
		/*boolean[] bool =  new boolean[256];
		bool[str.charAt(1)]=true;
		int chValue = str.charAt(1);
		System.out.println(chValue);
		System.out.println(bool[str.charAt(1)]);
		System.out.println(bool[str.charAt(2)]);*/
		
		/*boolean b1 = isStringUniqueWOCase("aA");
		
		System.out.println(b1);
		
		boolean b2 = isStringUniqueWithCase("aA");
		System.out.println(b2);
		
		boolean b3 = findUniqueWithoutOrder("amishi");
		System.out.println(b3);*/
	}

	public static boolean isStringUniqueWOCase(String str) {
		boolean[] charArray = new boolean[256];
		int charValue;
		for (int i = 0; i < str.length(); i++) {
			charValue = str.charAt(i);
			if(charValue<= 122 && charValue >= 97){
				charValue = charValue - 32;
			}
			if (charArray[charValue]) {
				return false;
			}else{
				charArray[charValue] = true;
			}
		}
		return true;
	}
	
	public static boolean isStringUniqueWithCase(String str) {
		boolean[] charArray = new boolean[256];
		int charValue;
		for (int i = 0; i < str.length(); i++) {
			charValue = str.charAt(i);
			if (charArray[charValue]) {
				return false;
			}else{
				charArray[charValue] = true;
			}
		}
		return true;
	}
	

	public static boolean findUniqueWithoutOrder (String str){
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		char prev;
		char current;
		char next;
		for(int i=1;i<charArray.length;i++){
			prev = charArray[i-1];
			current = charArray[i];
			next = charArray[i+1];
			
			if(prev == current){
				return false;
			}else if(current == next){
				return false;
			}
		}
		return true;
	}
	
	/*public static boolean isUniqueChars(String str) {
		 int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
		 int val = str.charAt(i) - 'a';
		 if ((checker & (1 << val)) > 0) return false;
		 checker |= (1 << val);
		 }
		 return true;
		 }*/
	
	
	public static boolean isStringUnique(String string){
		boolean[] uniqueArray = new boolean[256];
		for(int i=0;i<string.length();i++){
			if(uniqueArray[string.charAt(i)]== true){
				return false;
			}else{
				uniqueArray[string.charAt(i)]=true;
			}
		}
		return true;
	}
}
