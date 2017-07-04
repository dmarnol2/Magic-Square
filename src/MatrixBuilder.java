import java.util.Scanner;

public class MatrixBuilder {
	
	int[][] squareMatrix;
	int[] testArray;
	int size, sum;
	int comparator=0;
	int check=0;         // conditional for while loop
	
	public MatrixBuilder(int size) {
		this.squareMatrix=new int[size][size];
		this.size=size;
	}
	
	 public int[][] fill(int[] array){
		 //Scanner input = new Scanner(System.in);
		// System.out.println("Enter values for the Matrix one at a time: ");
		    for(int row=0;row<size;row++){
		    	for(int col=0;col<size;col++){
		    		squareMatrix[row][col]=array[col];
		    		}
		    	}
		    return squareMatrix;
		    }
	 
	 public boolean testForMagic(int[][] matrix){
	//print matrix
		 System.out.println("Your matrix is:");
		 for(int row=0;row<size;row++){
			 for(int col=0;col<size;col++){
		        	System.out.print(matrix[row][col]+" ");
		        	}
			 System.out.println();
			 }
		 
	//find value of 1st row and use to compare 
		 for (int i = 0; i <size; i++){
			 sum = 0;
			 comparator+=matrix[0][i];
			 }
		 System.out.println("Using the sum of the first row, each row, column, and diagonal "
		 		+ "should add to "+ comparator);
		 
	//check rows for magic square status
		 while(check==0){
			 for (int i = 0; i <size; i++){
				 sum = 0;
				 for (int j = 0; j < size; j++) {
				 sum += matrix[i][j];
				 }
				 }
			 
			 if (sum!=comparator){
				 check=1;
				 return false;
				 }
			 
	//check columns for magic square status
			 for (int i = 0; i <size; i++) {
				 sum = 0;
				 for (int j = 0; j < size; j++) {
				 sum += matrix[j][i];
				 }
			 	 }
			 if (sum!=comparator){
				 check=1;
				 return false;
				 }

	//check 1st diagonal
			 sum = 0;
			 for (int i = 0; i <size; i++){
				 sum+=matrix[i][i];
			 	 }
			 if (sum!=comparator){
				 check=1;
				 return false;
			 	 }
	
	//check 2nd diagonal
			 sum = 0;
			 for(int p=0;p<size;p++){
				 int k=matrix.length-p-1;
				 sum+=matrix[p][matrix.length-p-1];
				 k+=-1;
			 	 }
			 if (sum!=comparator){
				 check=1;
				 return false;
			 	 }
			 break;
			 } // end while loop
		 return true;
	 }  // end method
}	// end class



