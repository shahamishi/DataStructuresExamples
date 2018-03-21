package ArraysNStrings;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	static List<String> combinations = new ArrayList<String>();

	public static void main(String[] args) {
//		getCombination("Cisco");
//		System.out
//				.println("Total possible combinations available for the word Cisco is: "
//						+ combinations.size());
//		for (String string : combinations) {
//			System.out.println(string);
//		}
		
		comb4("Cisco");
	}

	/**
	 * For the given word, all possible combinations are put in the combinations
	 * string.
	 * 
	 * @param word
	 */
	public static void getCombination(String word) {
		getCombination(word, new char[word.length()], 0);
	}

	/**
	 * This is a recursive method. The exit condition for the method is total
	 * number of combinations available. Every time the method is called, either
	 * it finds the character of the given word or it replaces the number for
	 * the character at the particular index and calls the method again.
	 * 
	 * @param word
	 *            - Given word
	 * @param charArr
	 *            - character array for the intermediate actions
	 * @param index
	 *            - passed index
	 */
	private static void getCombination(String word, char[] charArr, int index) {
		if (combinations.size() == Math.pow(2, word.length())) {
			return;
		}
		if (index == word.length()) {
			combinations.add(new String(charArr));
		} else {
			char ch = word.charAt(index);
			charArr[index] = ch;
			getCombination(word, charArr, index + 1);
			charArr[index] = getNumbers(ch);
			getCombination(word, charArr, index + 1);
		}
	}

	/**
	 * Assumption is made that the mapping of character and number is already
	 * available.
	 * 
	 * @param character
	 *            - Given character
	 * @return - mapping number
	 */
	public static char getNumbers(char character) {

		switch (character) {
		case 'C':
			return '1';

		case 'i':
			return '2';

		case 's':
			return '3';

		case 'c':
			return '4';

		case 'o':
			return '5';

		default:
			return '~';
		}
	}

	public static void comb4(String word) {
		comb4(word, new char[word.length()], 0);
	}

	private static void comb4(String word, char[] accu, int index) {
		if (index == word.length()) {
			System.out.println(accu);
		} else {
			char ch = word.charAt(index);
			accu[index] = ch;
			comb4(word, accu, index + 1);
			accu[index] = getNumbers(ch);
			comb4(word, accu, index + 1);
		}
	}

}
