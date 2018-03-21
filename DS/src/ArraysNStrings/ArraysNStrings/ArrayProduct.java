package ArraysNStrings;
public class ArrayProduct {

	public static void main(String[] args) {
		int[] input = new int[6];
		
		for(int i=1;i<=input.length;i++){
			input[i-1]=i;
		}
		System.out.println("Input");
		for(int i =0;i<input.length;i++){
			System.out.print(input[i] +" ");	
		}
		System.out.println(" ");
		
		int[] product = arrayProduct(input);
		
		System.out.println("Product");
		for(int i =0;i<product.length;i++){
			System.out.print(product[i]+ " ");	
		}

	}
	
	private static int[] arrayProduct(int[] input){
		int[] product = new int[input.length];
		int p=1;
		
		for(int i=0;i<=input.length-1;i++){
			product[i]=p;
			p*=input[i];
		}
		
		p=1;
		for(int i=input.length-1;i>=0;i--){
			product[i]*=p;
			p*=input[i];
		}
		return product;
	}

}
