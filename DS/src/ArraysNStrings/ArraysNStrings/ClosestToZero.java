package ArraysNStrings;


import java.util.Arrays;
import java.util.Collections;

public class ClosestToZero {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 6,-9, -8, 7 };
		new ClosestToZero().findClosestToZero(arr);
	}

	public void findClosestToZero(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		int l = 0, r = arr.length - 1;
		int lInd = 0, rInd = arr.length-1;
		int sum = arr[l] + arr[r],curSum=0;;

		while (l < r) {
			curSum=arr[l] + arr[r];
			if (Math.abs(curSum) < Math.abs(sum)) {
				sum = curSum;
				lInd = l;
				rInd = r;
			}
			if (sum < 0)
				l++;
			else
				r--;
		}
		
		System.out.println("Closest to zero sum :"+sum+" Indexes are : "+lInd+" and "+rInd);
	}
}