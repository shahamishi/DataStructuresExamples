package ArraysNStrings;


public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String ("am''ishi Amishi(Am is hi)"); 
		
		System.out.println(str);
		
		str = replaceSpace(str);
		System.out.println(str);

	}

	public static String replaceSpace(String str){
		return str.replace("\'", "%20");
		
	}
}
