package ArraysNStrings;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int[][] matrix =  new int[3][5];
	/*System.out.println(matrix.length);
	System.out.println(matrix[0].length);
	System.out.println(matrix[1].length);
	*/
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[i].length;j++){
			matrix[i][j] = i+j+1;
		}
	}
	
	matrix[1][2]=0;
	
	printMatrix(matrix);
	//replaceZeroInMatrix(matrix);
	replaceZeroInMatrixSelfMade(matrix);
	System.out.println("After replacement");
	printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		
	}

	private static void replaceZeroInMatrix(int[][] matrix) {
		
		int[][] localMatrix = new int[matrix.length][matrix[0].length];
		
		for(int i=0;i<localMatrix.length;i++){
			for(int j=0;j<localMatrix[i].length;j++){
				localMatrix[i][j] = matrix[i][j];
			}
		}
		System.out.println("Inside replace method");
		printMatrix(localMatrix);
		
		for(int i=0;i<localMatrix.length;i++){
			for(int j=0;j<localMatrix[i].length;j++){
				if(localMatrix[i][j] == 0){
					for(int k=0;k<matrix[i].length;k++){
						matrix[i][k] =0;
					}
					for(int l=0;l<matrix.length;l++){
						matrix[l][j] =0;
					}
				}
			}
		}
		
	}
	
	
	//self-made
	private static void replaceZeroInMatrixSelfMade(int[][] matrix){
		boolean[][] copyMatrix = new boolean[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j] == 0){
					copyMatrix[i][j] = true;
				}else{
					copyMatrix[i][j] = false;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(copyMatrix[i][j]){
					for(int k=0;k<matrix.length;k++){
						matrix[k][j]=0;
					}
					for(int k=0;k<matrix[i].length;k++){
						matrix[i][k]=0;
					}
				}
			}
		}
	}
	
}
