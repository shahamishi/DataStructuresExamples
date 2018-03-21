package arrays;

public class MoveDownZero {

	public static void main(String[] args) {
		int[] array = new int[]{0,6,2,3,0,4,0,7,0,1,9};
		printArray(array);
//		moveDownZeroUsingBubbleSort(array);
		moveDownZeroUsingArrayCopy(array);
		System.out.println("After");
		printArray(array);
	}

	private static void moveDownZeroUsingArrayCopy(int[] array) {
		int noOfZeros=0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]==0){
				System.arraycopy(array, i+1, array, i, array.length-i-1);
				noOfZeros++;
			}
			
		}
		System.out.println(" ");
		System.out.println(noOfZeros);
		for(int i=array.length-noOfZeros;i<array.length;i++){
			array[i]=0;
		}
		
	}

	private static void moveDownZeroUsingBubbleSort(int[] array) {
		int temp;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]==0){
					temp= array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("After");
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			
		}
	}

}
