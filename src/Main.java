import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Let's create a square matrix. Please enter the "
				+ "number of columns: ");
		
		size = scan.nextInt();
		
		System.out.println("We are going to create a matrix of size "+size+" X "+size);
		
		int[][] matrix = new  int[size][size];
		
		MatrixBuilder mb = new MatrixBuilder(matrix, size);
		int[][] result = mb.fill();
		mb.testForMagic(result);
		}
}
	

