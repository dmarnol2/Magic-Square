package core;

import java.util.HashSet;

/**
 * This program determines if the numbers entered by
 * the user creates a n X n matrix where all the rows,
 * columns, and diagonals when added are equal.
 * 
 * @author Dave Arnold
 * @version 1.1
 * @since 2017-06-30
 *
 */

public class MagicSquare {
	
	private boolean isMagic;
	private int sqrt;
	private int[] intArray;
	String[] strArray;//=null;
	
	/**
	 * Constructor.
	 */
	public MagicSquare(){
		}
	
	/**
	 * Constructor.	
	 * 
	 * @param array  creates object with Sting array and
	 *               corresponding integer array
	 * 
	 */
	public MagicSquare(String[] array){
		strArray=array;
		setIntArray(array);
		}

			
	/**
	 * Converts passed String array to an Integer array
	 * 
	 * @param array   The String array being tested
	 */
	public void setIntArray(String[] array){
		intArray = new int[array.length];
		for (int k=0; k<array.length;k++){
			intArray[k]=Integer.parseInt(array[k]);
			}
		}
	
	/**
	 * 	
	 * @return int[]  intArray
	 */
	public int[] getIntArray(){
		return intArray;
		}
	
	/**
	 * Takes length of String array and calculates it's
	 * square root. 
	 * 
	 * @param array  The String array being tested 
	 * @return double  square root 
	 */
	public double findSquareRoot(String[] array){
		int num = array.length;
		double square = Math.sqrt(num);
		return square;
		}
	
	/**
	 * This method determines if there are enough elements in the array
	 * to make a n X n (square) matrix. It multiplies the sqrt of the array size
	 * by itself and if it equals the size of the array then it is a square matrix.
	 * 
	 * Uses the method findSquareRoot.
	 * 
	 * @param array   The String array being tested
	 * @return boolean  true if array has enough elements to make a n X n matrix
	 * 					otherwise returns false
	 */
	public boolean squareMatrix(String[] array){
		int size = array.length;
		double temp=findSquareRoot(array);
		if(temp*temp == size) {
			sqrt=(int) temp;
			//System.out.println("You created a "+temp+" X "+temp+ " matrix: ");
			return true;
			}
		else{
			System.out.println("You entered "+size+" numbers which does not make a square matrix.");
			return false;
			}
		}
			
	/**
	 * This method takes array being tested and tests if it is
	 * a Magic Square.
	 * 
	 * Uses methods: setIntArray, checkDuplicates, squareMatrix, and getIntArray
	 * 
	 * @param array  	The String array being tested
	 * 
	 * @return boolean 	true if array meets conditions to be
	 * 				 	considered a Magic Square, otherwise returns false.
	 */
	public boolean testForMagic(String[] array){
		
		setIntArray(array);
		if(checkDuplicates(array)){
			return false;
			}
		else if(squareMatrix(array)){
			MatrixBuilder mb = new MatrixBuilder(sqrt);
			int[][] result = mb.fillMatrix(getIntArray());
			isMagic=mb.testForMagic(result);
			if(isMagic){
				System.out.println("True, you created a Magic Square.");
				return true;
				}
			else
				System.out.println("False, you did not create a Magic Square.");
				}	
		return false;
		}
	
/**
 * Checks the user input for elements entered more than once
 * 
 * @param array String array of elements entered by user
 * @return boolean false if no duplicates, or true if duplicates are found
 */
	public boolean checkDuplicates(String[] array){
	
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : array) {
			if(!set.add(arrayElement)) {
				System.out.println("You entered "+arrayElement+" more than once. Please try again.");
				return true;
				}
			} // end for loop
		return false;
		}
}
	
	

