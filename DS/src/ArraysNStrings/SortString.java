package ArraysNStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SortString {

	public static String sortString(String str){
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		str = new String(charArray);
		return str;
	}

	public static void main(String[] args){
		Set<String> s = new HashSet<String>();
		s.add("Amishi");
		s.add("Shah");
		s.add("Amishi");
		List<String> l = new ArrayList<String>();
		
		l.addAll(s);
		List<String> re = new ArrayList<String>();
		re.add("Amishi");
		//boolean val = l.retainAll(re);
				//Arrays.asList(Collections.addAll(s));
		l.remove(0);
	//	System.out.println(val);
		Collections.sort(l);
		for(String str5:l){
			System.out.println(str5);
		}
		/*
		String str = new String("GBNHUACB");
		System.out.println(str);
		String sortedString= sortString(str);
		System.out.println(sortedString);
		
		String[] stArray = new String[]{"Amishi", "Shah","Patel","Ashutosh","Ajani","Akil"};
		for(String str1:stArray){
			System.out.print(str1 + " ");
		}
		System.out.println(" ");
		sortStringArray(stArray);
		for(String str2:stArray){
			System.out.print(str2 + " ");
		}
		
		System.out.println(" ");
		rotateStringArray(stArray);
		for(String str2:stArray){
			System.out.print(str2 + " ");
		}
		*/
	}
	
	public static void sortStringArray(String[] strArray){
		Arrays.sort(strArray);
//		return strArray;
		
		}
	
	public static String[] rotateStringArray(String[] strArray){
		Collections.rotate(Arrays.asList(strArray), 1);
		return strArray;
	}
}
