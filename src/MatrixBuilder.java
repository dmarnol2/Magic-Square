import java.util.Scanner;

public class MatrixBuilder {
	
	int[][] squareMatrix;
	int size, sum;
	int comparator=0;
	int check=0;
	
	public MatrixBuilder(int[][] matrix, int size) {
		this.squareMatrix=matrix;
		this.size=size;
	}
	
	 public int[][] fill(){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the elements for the Matrix");
		    for(int row=0;row<size;row++){
		    	for(int col=0;col<size;col++){
		    		squareMatrix[row][col]=input.nextInt();
		    		}
		    	}
		    return squareMatrix;
		    }
	 
	 public void testForMagic(int[][] result){
	//print matrix
		 System.out.println("Your matrix is:");
		 for(int row=0;row<size;row++){
			 for(int col=0;col<size;col++){
		        	System.out.print(result[row][col]+" ");
		        	}
			 System.out.println();
			 }
		 
	//find value of 1st row and use to compare 
		 for (int i = 0; i <size; i++){
			 sum = 0;
			 comparator+=result[0][i];
			 }
		 System.out.println("Each row, column, and diagonal should add to " + comparator);
		 
	//check rows for magic square status
		 while(check==0){
			 for (int i = 0; i <size; i++){
				 sum = 0;
				 for (int j = 0; j < size; j++) {
				 sum += result[i][j];
				 }
				 }
			 
			 if (sum!=comparator){
				 System.out.println("Sorry, your matrix is not a Magic Square.");
				 check=1;
				 break;
				 }
			 
	//check columns for magic square status
			 for (int i = 0; i <size; i++) {
				 sum = 0;
				 for (int j = 0; j < size; j++) {
				 sum += result[j][i];
				 }
			 	 }
			 if (sum!=comparator){
				 System.out.println("Sorry, your matrix is not a Magic Square.");
				 check=1;
				 break;
				 }

	//check 1st diagonal
			 sum = 0;
			 for (int i = 0; i <size; i++){
				 sum+=result[i][i];
			 	 }
			 if (sum!=comparator){
				 System.out.println("Sorry, your matrix is not a Magic Square.");
				 check=1;
				 break;
			 	 }
	
	//check 2nd diagonal
			 sum = 0;
			 for(int p=0;p<size;p++){
				 int k=result.length-p-1;
				 sum+=result[p][result.length-p-1];
				 k+=-1;
			 	 }
			 if (sum!=comparator){
				 System.out.println("Sorry, your matrix is not a Magic Square.");
				 check=1;
				 break;
			 	 }
		 
			 System.out.println("Your matrix is a Magic Square!!");
			 break;
		 } // end while loop
	 }  // end method
}	// end class



