import java.util.ArrayList;
import java.util.List;


public class PassBy {

	public static void main(String[] args) {
		Integer i1 = new Integer(2);
		Integer i2 = new Integer(3);
		
		char c1 = 'a';
		char c2 = 'b';
		
		
		System.out.println("Before Swap");
		 System.out.println("i1: "+ i1 + " i2: "+i2);
		 System.out.println("c1: "+ c1 +" c2: "+c2);
		
		swap(c1,c2);
		swap(i1,i2);
		
		System.out.println("After Swap");
		System.out.println("i1: "+ i1 + " i2: "+i2);
		System.out.println("c1: "+ c1 +" c2: "+c2);
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		System.out.println("Before Method");
		for(Integer i:integerList){
			System.out.println(i);
		}
		System.out.println("After Method");
		method(integerList);
		for(Integer i:integerList){
			System.out.println(i);
		}
		
		int[] ar = new int[2];
		ar[0]=1;
		System.out.println("Before Method");
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		 methodInt(ar);
		System.out.println("After Method");
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}
	
	private static void method(List<Integer> integerList){
		integerList.add(2);
	}
	
	private static void methodInt(int[] a){
		int length = a.length;
		a[1] = 2;
	}

	private static void swap(Integer i1, Integer i2) {
		Integer temp = i1;
		i1=i2;
		i2=temp;
		
	}

	private static void swap(char c1, char c2) {
		char temp =c1;
		c1=c2;
		c2=temp;
		
	}
}
