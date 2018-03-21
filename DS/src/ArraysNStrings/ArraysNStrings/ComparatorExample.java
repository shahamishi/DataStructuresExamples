package ArraysNStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorExample {

	static List<String> values;
	static List<Entry<String,String>> entrySetValues;

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "e");
		map.put("2", "d");
		map.put("3", "c");
		map.put("4", "b");
		map.put("5", "a");

//		values = new ArrayList<>(map.values());

		entrySetValues = new ArrayList<Entry<String,String>>(map.entrySet());
		for (Entry<String,String> entry : entrySetValues) {
			System.out.print(entry.getKey()+":"+entry.getValue()+ "  ");
		}

		Collections.sort(entrySetValues, ComparatorExample.ValueComparator);
		
		System.out.println(" ");
		System.out.println("after");
		
		for (Entry<String,String> entry : entrySetValues) {
			System.out.print(entry.getKey()+":"+entry.getValue()+ "  ");
		}
	}

	public static Comparator<Entry<String,String>> ValueComparator = new Comparator<Entry<String,String>>() {

		@Override
		public int compare(Entry<String,String> o1, Entry<String,String> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
	};

}
