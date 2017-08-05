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
 * @since 2017-06-30
 *
 */

public class TestMagicSquare {
	
	static MagicSquare magic;
	
	// to test constructor that takes array as param
	static MagicSquare constructor2;
	static MagicSquare constructor2a;
	static MagicSquare constructor2b;
	static MagicSquare constructor2c;
	
	public static final String[] magicArray={"8","1","6","3","5", "7", "4", "9", "2"};
	public static final String[] failSize={"1","6","3","5","7"};
	public static final String[] failDuplicates = {"3","5", "7", "4", "7", "2"};
	public static final String[] failMagicTest = {"1","2","3","4","5", "6", "7", "8", "9"};
	
	/**
	 * This method creates objects for each account type that is 
	 * shared by both test methods.
	 * 
	 * @throws Exception if exception occurs
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		magic = new MagicSquare();
		constructor2 = new MagicSquare(magicArray);
		constructor2a = new MagicSquare(failSize);
		constructor2b = new MagicSquare(failDuplicates);
		constructor2c = new MagicSquare(failMagicTest);
		
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
		constructor2=null;
		constructor2a=null;
		constructor2b=null;
		constructor2c=null;
	}

	/**
	 * This method tests for failing results using assertFalse.
	 * Tests if array fails to contain the right amount of elements to 
	 * make a square matrix n X n. 
	 */
	@Test
	public void testSquareMatrix() {
		assertFalse(magic.squareMatrix(failSize));
		assertFalse(constructor2a.squareMatrix(constructor2a.getStrArray()));
		}
	
	/**
	 * This method tests for failing results using assertTrue.
	 * Tests if array contains duplicates elements. If duplicate
	 * elements exists then array fails condition of Magic Square. 
	 */
	@Test
	public void testCheckDuplicates(){
		assertTrue(magic.checkDuplicates(failDuplicates));
		assertTrue(constructor2b.checkDuplicates(constructor2b.getStrArray()));
		}
	
	/**
	 * This method tests for failing results with an array that is not a 
	 * Magic Square. Uses assertFalse. Tests if n X n square array has all rows, 
	 * columns, and diagonals that add up to the same value.  
	 */
	@Test
	public void testTestForMagic(){
		assertFalse(magic.testForMagic(failMagicTest));
		assertFalse(constructor2c.testForMagic(constructor2c.getStrArray()));
		}
	
	/**
	 * This method tests for passing results using a valid
	 * square Matrix and test the methods:
	 * squareMatrix, checkDuplicates, and testForMagic.
	 * Uses assertFalse and assertTrue.
	 */
	@Test
	public void testApplication(){
		assertTrue(magic.squareMatrix(magicArray));
		assertFalse(magic.checkDuplicates(magicArray));
		assertTrue(magic.testForMagic(magicArray));
		assertTrue(constructor2.squareMatrix(constructor2.getStrArray()));
		assertFalse(constructor2.checkDuplicates(constructor2.getStrArray()));
		assertTrue(constructor2.testForMagic(constructor2.getStrArray()));
		
		}
 
}
