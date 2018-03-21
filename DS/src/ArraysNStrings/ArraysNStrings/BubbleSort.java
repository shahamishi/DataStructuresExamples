package ArraysNStrings;


public class BubbleSort {
 
	public static void main (String[] args){
	 int[] unsortedArray = new int[]{8,3,44,12,23,9,3,2};
	 System.out.println("Before Sorting");
	 printArray(unsortedArray);
	 
	 int[] sortedArray = bubbleSort(unsortedArray);
	 System.out.println("After Sorting");
	 printArray(sortedArray);
	 
	 int[] reverseSortedArray = reverseBubbleSort(unsortedArray);
	 System.out.println("After Reverse Sorting");
	 printArray(reverseSortedArray);
	 
	
 }
	
	private static void printArray(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++){
			System.out.print(inputArray[i]+ " ");
		}
		System.out.println(" ");
		
	}

	private static int[] reverseBubbleSort(int[] inputArray){
		
		for(int i=inputArray.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(inputArray[j] < inputArray[j+1]){
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
		}
		return inputArray;
	}
	
	private static int[] bubbleSort(int[] inputArray){
		
		for(int i=inputArray.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(inputArray[j] > inputArray[j+1]){
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
		}
		return inputArray;
	}
}
