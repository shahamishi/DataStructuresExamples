package ArraysNStrings;

public class IsSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Amishi is a cutie pie.";
		String s2 = "is an";
		String s3 = "waterbottle";
		String s4 = "erbottlewat";
		String s5 = s4+s4;
		
		boolean check =  isSubString (s5,s3);
		System.out.println(check);
		boolean result = isSubString(s1, s2);
		System.out.println(result);

	}

	public static boolean isSubString(String s1,String s2){
		if (s1.contains(s2)){
			return true;
		}else
			return false;
	}
}
