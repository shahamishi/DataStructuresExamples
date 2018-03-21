package ArraysNStrings;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		// integerList.add(1);

		System.out.println("Before Method");
		for (Integer i : integerList) {
			System.out.println(i);
		}
		System.out.println("After Method");
		fibonacci(integerList, 15);
		for (Integer i : integerList) {
			System.out.print(i + " ");
		}
		
		
	}

	private static void fibonacci(List<Integer> integerList, int n) {
		if (n != 0) {
			int size = integerList.size();
			if (size <= n - 2) {
				if (integerList.size() == 0 || integerList.size() == 1) {
					integerList.add(1);
				} else {
					integerList.add(integerList.get(size - 1)
							+ integerList.get(size - 2));
				}
				fibonacci(integerList, n);
			} else {
				if (integerList.size() == 0 || integerList.size() == 1) {
					integerList.add(1);
				} else {
					integerList.add(integerList.get(size - 1)
							+ integerList.get(size - 2));
				}
			}

		}
	}
}
