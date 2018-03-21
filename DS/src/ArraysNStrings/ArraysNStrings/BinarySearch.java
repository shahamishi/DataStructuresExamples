package ArraysNStrings;
/**
 * Find the position of x and y using binary search.
 * @author ashah
 *
 */
public class BinarySearch {
	
	
public static void main(String[] args) {
	int[] arr = new int[]{2,4,6,8,10,12,14,16,18,20};
	int x=5;
	int y=20;
	int positionX = binarySearch(arr,0,arr.length,x);
	int positionY = binarySearch(arr,0,arr.length,y);
	
	System.out.println("x found at position: "+positionX);
	System.out.println("y found at position: "+positionY);
}

private static int binarySearch(int[] arr, int start, int end, int number) {
	if(start<end){
		int mid = start+((end-start)/2);
		if(arr[mid]==number) 
			return mid;
		else if(arr[mid]>number){
			return binarySearch(arr, start, mid-1, number);
		}else{
			return binarySearch(arr, mid+1, end, number);
		}
	}
	else{
		return -1;
	}
}
}
