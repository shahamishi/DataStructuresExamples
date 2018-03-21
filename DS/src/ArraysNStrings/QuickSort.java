
public class QuickSort {
//	static int[] arr = new int[]{45,23,67,12,78,11,8,2,5};
	
	static char[] arr = new char[]{'b','t','c','y','d','a'};
	
	public static void main(String[] args) {
	for(char i=0;i<arr.length;i++){
		System.out.println((arr[i]));
	}
		preQuickSort(arr);
		for(char i=0;i<arr.length;i++){
			System.out.println((arr[i]));
		}
		
		//String str = new String(arr);
	}
	
	
	public static void preQuickSort(char[] arr){
		int length = arr.length -1;
		quickSort(0,length);
	}

	private static void quickSort(int start, int end) {
		int low = start;
		int high = end;
		int pivot = arr[start +((end-start)/2)];
		int i = low;
		int j = high;
		while(i<=j){
		while(arr[i]<pivot){
			i++;
		}
		while(arr[j]>pivot){
			j--;
		}
		if(i<=j){
			swap(i,j);
			i++;
			j--;
		}
		}
		if(low<j){
			quickSort(low,j);
		}
		if(i<high){
			quickSort(i,high);
		}
		
	}

	private static void swap(int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
