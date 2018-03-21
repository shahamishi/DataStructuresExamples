package ArraysNStrings;

import java.util.Arrays;
import java.util.Collections;


public class RemoveDuplicateStr {

	/**
	 * @param args
	 */
	static char[] charArray1 = new char[]{'A','m','i','s','h','i'};
	static char[] charArray = new char[]{'f','o','l','l','o','w',' ','u','p'};
	static int counter;
	public static void main(String[] args) {
		
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i] + " ");
		}
//		removeDuplicateFromStringChangingOrder();
		removeDuplicates(charArray);
		System.out.println();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i] + " ");
		}
		
		/*
		char[] charArray1 = new char[]{'A','a','i','i','h','j'};
		char[] followUp = new char[]{'f','o','l','l','o','w',' ','u','p'};
		//removeDuplicates(charArray1);
		removeDuplicates(followUp);
		System.out.println(followUp);*/

	}
	
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		
		 int tail = 1;
		
		 for (int i = 1; i < len; ++i) {
		 int j;
		 for (j = 0; j < tail; ++j) {
		 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
		 str[tail] = str[i];
		 ++tail;
		 }
		 }
		 for(int k=tail;k<len;k++){
			 str[k] = '0';
			 
		 }
		 }
	//self-made
	public static void removeDuplicateFromStringChangingOrder(){
		int start=0;
		int end = 1;
		routine(start,end);

	}
	
	//Self-made
	public static void routine(int start, int end){
		int length = charArray.length -1;
		
		
		for(int i =0;i<=end;i++){
			for(int j=i+1;j<=end;j++){
				if(charArray[i]==charArray[j]){
					//counter ++;
					int k =j;
					while(k<charArray.length-1){
							charArray[k] = charArray[k+1];
							k++;
					}
					charArray[k] = ';';
					
				}
			}
		}
		if( end != length){
			end++;
			routine(start,end);
		}
	}
}
