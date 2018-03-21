package arrays;
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] ={3,2,5,1,6,9};
//		for(int i=0;i<arr.length;i++){
//			for(int j=i;j<arr.length;j++){
//				if(arr[i] > arr[j]){
//					int temp=arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		System.out.println(arr[i]);
		
		int arr2[] ={3,2,5,1,6,9,16,11};
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<(arr2.length-i-1);j++){
				if(arr2[j]<arr2[j+1]){
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
			
		}
		
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);

	}
	

}
