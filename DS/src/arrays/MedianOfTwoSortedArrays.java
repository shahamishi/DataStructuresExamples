package arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] input1 = new int[2];
		int[] input2 = new int[5];
		int count=1;
		
		for(int i=0;i<input1.length;i++){
			input1[i] = count;
			count+=2;
		}
		count=2;
		for(int i=0;i<input2.length;i++){
			
			input2[i] = count;
			count+=2;
		}
		
		printArray(input1);
		printArray(input2);
		
		int median1 = findMedian(input1);
		int median2 = findMedian(input2);
		
		System.out.println("median of input1: "+median1);
		System.out.println("median of input2: "+median2);
		
		int medianOfMergedArray = findMedianofMergedArray(input1,input2);
		System.out.println("Median of merged array is: "+medianOfMergedArray);
	}
	
	private static int findMedianofMergedArray(int[] input1, int[] input2) {
		int totalLength = input1.length + input2.length;
		int median=-1;
		int i=0,j=0;
		if(totalLength%2==0){
			char lastIncremented=0;
			while((i+j)<=totalLength/2){
				if(input1[i]<input2[j]){
					median=input1[i];
					if(i<input1.length-1){
						i++;
					}else{
						
					}
					lastIncremented='i';
				}else{
					median=input2[j];
					if(j<input2.length-1){
						j++;
					}else{
						
					}
					lastIncremented='j';
				}
			}
			if(lastIncremented=='i'){
				median = (median + input2[j-1])/2;
			}
			else{ 
			  median = (median + input1[i-1])/2;
			}
			return median;
		}else{
			
			while((i+j)<=totalLength/2){
				if(input1[i]<input2[j]){
					median=input1[i];
					i++;
				}else{
					median=input2[j];
					j++;
				}
			}
			return median;
		}
		
		
		
	}

	private static int findMedian(int[] input) {
		int length=input.length;
		if(input.length%2==0){
			return (input[length/2]+input[length/2-1])/2;
		}else{
			return input[length/2];
		}
		
		
	}

	private static void printArray(int[] array){
		System.out.println("Array is as below");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}
