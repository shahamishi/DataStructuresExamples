package ArraysNStrings;

public class FindingString {

	/**
	 * @param args
	 */
	public static String findString = "My Name is Amishi";
	public static String mainString = "This is US.My Name is Amishi.I work for Cognizant. My Name is Amishi.";
	public static void main(String[] args) {
		boolean b = mainString.contains(findString);
		System.out.println(b);
		System.out.println("First occurance: "+mainString.indexOf(findString));
		System.out.println("Last occurance: "+mainString.lastIndexOf(findString));
	}

}
