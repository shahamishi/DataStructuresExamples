package ArraysNStrings;

public class LongestPalindrome {

	
	public static void main(String[] args) {
		String str = "ABABCDDDDCBABC";
		String longestPalindrome = findLongestPalindrome(str);
		System.out.println(longestPalindrome);
		
	}

	private static String findLongestPalindrome(String str) {
		String longestPalindrome="";
		String temp;
		for(int i=0;i<str.length();i++){
			temp =helper(str, i, i);
			if(temp.length()>longestPalindrome.length()){
				longestPalindrome = temp;
			}
			temp =helper(str, i, i+1);
			if(temp.length()>longestPalindrome.length()){
				longestPalindrome = temp;
			}
		}
		return longestPalindrome;
	}
	
	private static String helper(String str,int startIndex, int endIndex){
		
		while(startIndex>=0 && endIndex <= str.length()-1 && (str.charAt(startIndex) == str.charAt(endIndex))){
			startIndex--;
			endIndex++;
		}
		
		return str.substring(startIndex+1, endIndex);
	}
}
