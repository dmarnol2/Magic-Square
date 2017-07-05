
/**
 * This class takes the user input and creates a 
 * 2D array, prints the array, and sums each row, column,
 * and diagonal to test if it is a Magic Square. Uses methods
 * fillMatrix, printMatrix, and testForMagic.
 * 
 * @author Dave Arnold
 * @since 2017-06-30
 *
 */

public class MatrixBuilder {
	
	int[][] squareMatrix;
	int[] testArray;
	int size, sum;
	int comparator=0;
	int count = 0;
	int check=0;         // conditional for while loop
	
	
/**
 * Constructor.	
 * 
 * @param size  Takes size based on number of elements entered
 * 			   	and uses value to create matrix
 * 
 */
	public MatrixBuilder(int size) {
		this.squareMatrix=new int[size][size];
		this.size=size;
		}	
	
	/**
	 * Method takes 1D array of user input and creates
	 * 2D square matrix of size n X n
	 * 
	 * @param array The one dimensional array of user input
	 * @return the matrix created
	 */
	
	public int[][] fillMatrix(int[] array){
	    for(int row=0;row<size;row++){
	    	for(int col=0;col<size;col++){
	    		squareMatrix[row][col]=array[count];
	    		count++;
	    		}
	    	}
	    printMatrix(squareMatrix);
	    return squareMatrix;
	 	}
	 
	/**
	 * Method prints user's square matrix
	 * 
	 * @param matrix the 2D matrix created from user input
	 *  
	 */
	public void printMatrix(int[][] matrix){
		 for(int row=0;row<size;row++){
			 for(int col=0;col<size;col++){
		        	System.out.print(matrix[row][col]+" ");
		        	}
			 System.out.println();
			 }
	 }
	 
	/**
	 * Method determines the sum of each row, column, and diagonal and checks
	 * if the requirements of Magic Square are met. Method calculates 1st row 
	 * and uses value as a comparator for all the remaining calculations. 
	 * Calculates rows first, then columns, then diagonals and compares each 
	 * to comparator. Once a compare shows unequal elements, no further 
	 * calculations are needed and the program exits immediately.
	 * 
	 * @param matrix the 2D matrix created from user input
	 * @return boolean true if Magic Square, or false if not Magic Square
	 */
	public boolean testForMagic(int[][] matrix){
		
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



