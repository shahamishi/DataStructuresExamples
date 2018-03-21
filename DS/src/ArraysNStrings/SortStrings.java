package ArraysNStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;


public class SortStrings {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		
		strings.add("amishi");
		strings.add("ami");
		strings.add("amish");
		strings.add("isha");
		strings.add("mishi");
		
		System.out.println("Before Sorting");
		System.out.println(strings);
		
		strings = sort(strings);
//		Collections.sort(strings);
		System.out.println("After Sorting");
		System.out.println(strings);
		
	
	}

	private static List<String> sort(List<String> strings) {

		Map<Integer,List<String>> sortedMap = new TreeMap<Integer,List<String>>();
		for(String s:strings){
			if(sortedMap.containsKey(s.length())){
				
				sortedMap.get(s.length()).add(s);
			}else{
				List<String> list = new ArrayList<String>();
				list.add(s);
				sortedMap.put(s.length(),list);
			}
		}
		strings = new ArrayList<String>();
		for(List<String> strs:sortedMap.values()){
			if(strs.size()>1){
				Collections.sort(strs);
			}
			for(String s:strs)
			strings.add(s);
		}
		return strings;
	}

}
