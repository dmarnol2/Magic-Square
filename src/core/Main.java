package core;


/**
 * This program determines if the numbers entered by
 * the user creates a n X n matrix where all the rows,
 * columns, and diagonals when added are equal.
 * 
 * @author Dave Arnold
 * @version 1.0
 * @since 2017-06-30
 *
 */

public class Main {
	
	/**
	 * This is the main method that takes a string of numbers
	 * from user and verifies user input meets requirements of no
	 * duplicate elements, matrix forms a perfect square, and each
	 * row, column, and diagonal when summed equal all the others.
	 * Takes string array as input and converts to integer array.
	 * Determines size of array based on number of elements entered.
	 * Outputs true if Magic Square, or false if it is not.
	 * Uses checkDuplicates method and MatrixBuilder class.
	 *  
	 * @param args Unused
	 *  
	 */
	public static void main(String[] args) {
		
		MagicSquare magic = new MagicSquare();
		magic.getUserInput();
		
		
	}
} // end class
	

