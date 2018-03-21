package ArraysNStrings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.ComboPopup;

public class Permutation {

	public static void main(String[] args) {
		String s = "amisHI";

		Set<String> possiblePermutaions = findPossiblePermutation(s);
		System.out.println("Total possible unique permutations of the word "+ s +" is "+ possiblePermutaions.size());
		for (String str : possiblePermutaions) {
			System.out.println(str);
		}
		
	}

	private static Set<String> findPossiblePermutation(String s) {
		Set<String> combinations = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			combinations = formWords(combinations, s.charAt(i));
//			combinations.addAll(formWords(combinations, s.charAt(i))); // Gives Anagrams(All possible combination of the chars of the word)
		}

		return combinations;
	}

	private static Set<String> formWords(Set<String> strCombinations, char c) {
		Set<String> combinations = new HashSet<String>();
		String sb;
		String sub1;
		String sub2;
		if (strCombinations.size() == 0) {
			combinations.add(new String(new char[] { c }));
			return combinations;
		} else {

			for (String str : strCombinations) {
				for (int i = 0; i < str.length() + 1; i++) {
					sb = null;
					sub1 = str.substring(0, i);

					if (i < str.length()) {
						sub2 = str.substring(i, str.length());
					} else {
						sub2 = new String();
					}
					sb = sub1 + c + sub2;
					combinations.add(sb);
				}
			}
		}
		return combinations;
	}
}
