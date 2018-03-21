package ArraysNStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindingSecondHighestNumber {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Integer[] intArray = new Integer[]{3,6,8,1,10};
		
		/*List<Integer> intList = Arrays.asList(intArray);
		Collections.sort(intList);
		int length = intList.size();
		System.out.println(intList.get(length-2));*/
		
		int highest = intArray[0];
		int secondHighest = intArray[0];
		
		for(int i=1;i<=intArray.length-1;i++)
		{
			if(intArray[i]>secondHighest && intArray[i]<highest){
				secondHighest=intArray[i];
			}
			else if(intArray[i] > highest){
				secondHighest=highest;
				highest=intArray[i];
			}
			
		}
		
		System.out.println("Second Highest No is: "+secondHighest);
	}

}
