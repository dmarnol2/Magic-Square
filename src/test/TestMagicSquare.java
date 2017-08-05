package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import core.*;

/**
 * This is a JUnit test for the MagicSquare class that
 * tests the methods: checkDuplicates, testForMagic, and squareMatrix.
 * Test both failing and passing results, both constructors, and
 * tests the application as a whole. 
 * 
 * @author Dave Arnold
 * @since 2017-08-04
 *
 */

public class TestMagicSquare {
	
	static MagicSquare magic;
	static MagicSquare testConstructor2;
	
	/**
	 * This method creates objects for each account type that is 
	 * shared by both test methods.
	 * 
	 * @throws Exception if exception occurs
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		magic = new MagicSquare();
		testConstructor2 = new MagicSquare();
	}
	
	/**
	 * This method runs after all the tests have been completed
	 * to release resources used in testing.
	 *
	 * @throws Exception if exception occurs
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		magic=null;
		testConstructor2=null;
	}

	/**
	 * This method tests for failing results using assertFalse.
	 * Tests if array fails to contain the right amount of elements to 
	 * make a square matrix n X n. 
	 */
	@Test
	public void testSquareMatrix() {
		String[] failSize = {"1","6","3","5","7"};
		assertFalse(magic.squareMatrix(failSize));
		assertFalse(testConstructor2.squareMatrix(failSize));
		}
	
	/**
	 * This method tests for failing results using assertTrue.
	 * Tests if array contains duplicates elements. If duplicate
	 * elements exists then array fails condition of Magic Square. 
	 */
	@Test
	public void testCheckDuplicates(){
		String[] failDuplicates = {"3","5", "7", "4", "7", "2"};
		assertTrue(magic.checkDuplicates(failDuplicates));
		assertTrue(testConstructor2.checkDuplicates(failDuplicates));
		}
	
	/**
	 * This method tests for failing results with an array that is not a 
	 * Magic Square. Uses assertFalse. Tests if n X n square array has all rows, 
	 * columns, and diagonals that add up to the same value.  
	 */
	@Test
	public void testTestForMagic(){
		String[] failMagicTest = {"1","2","3","4","5", "6", "7", "8", "9"};
		assertFalse(magic.testForMagic(failMagicTest));
		assertFalse(testConstructor2.testForMagic(failMagicTest));
		}
	
	/**
	 * This method tests for passing results using a valid
	 * square Matrix and test the methods:
	 * squareMatrix, checkDuplicates, and testForMagic.
	 * Uses assertFalse and assertTrue.
	 */
	@Test
	public void testApplication(){
		String[] validMagicArray = {"8","1","6","3","5", "7", "4", "9", "2"};
		assertTrue(magic.squareMatrix(validMagicArray));
		assertFalse(magic.checkDuplicates(validMagicArray));
		assertTrue(magic.testForMagic(validMagicArray));
		assertTrue(testConstructor2.squareMatrix(validMagicArray));
		assertFalse(testConstructor2.checkDuplicates(validMagicArray));
		assertTrue(testConstructor2.testForMagic(validMagicArray));
		
		}
 
}
