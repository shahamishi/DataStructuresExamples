package ArraysNStrings;

/**
 * Given a sorted array arr[] and a number x, write a function that counts the
 * occurrences of x in arr[]. Expected time complexity is O(Logn)
 * 
 * @author ashah
 * 
 */
public class CountOccurrence {
public static void main(String[] args) {
	int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
	int x=3;
	int occurrence = countOccurrence(arr,x);
	System.out.println("Number of occurrence of 3 is : " + occurrence);
}

private static int countOccurrence(int[] arr, int x) {
	int first = findFirstOccurrence(arr,x,0,arr.length-1);
	int last;
	if(first!=-1)
		last = findLastOccurrence(arr,x,first,arr.length-1);
	else
		return -1;
	return last-first+1;
}

private static int findLastOccurrence(int[] arr, int x, int low, int high) {
	if(high>=low){
		int mid = (low+high)/2;
		if(mid==high||arr[mid+1]>x&&arr[mid]==x){
			return mid;
		}else if(x<arr[mid]){
			return findLastOccurrence(arr,x,low,mid-1);
		}else{
			return findLastOccurrence(arr,x,mid+1,high);
		}
		}
		return -1;
}

private static int findFirstOccurrence(int[] arr, int x, int low, int high) {
	if(high>=low){
	int mid = (low+high)/2;
	if(mid==0||arr[mid-1]<x&&arr[mid]==x){
		return mid;
	}else if(x<=arr[mid]){
		return findFirstOccurrence(arr,x,0,mid-1);
	}else{
		return findFirstOccurrence(arr,x,mid+1,high);
	}
	}
	return -1;
}
}
