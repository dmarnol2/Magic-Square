import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int z=1;
		int sqrt;
		int size=5;
		boolean magic;
		int[] intArray;
		
		Scanner scan = new Scanner(System.in);
		//List<String> numbers = new ArrayList<>();
		
		do{
		System.out.println("Enter a list of numbers, use comma to seperate numbers");
		String test = scan.nextLine();
		String delims ="[,]";
		String[] test1 = test.split(delims);
		intArray = new int[test1.length];
		for (int k=0; k<test1.length;k++){
			intArray[k]=Integer.parseInt(test1[k]);
		}
		for(int k=0;k<intArray.length;k++){
			System.out.print(intArray[k]+" ");
		}
		
		int num=test1.length;
		System.out.println(test1.length);
		sqrt = (int) Math.sqrt(num);
		System.out.println(sqrt);
		if(sqrt*sqrt == num) {
			System.out.println("We are going to create a matrix of size "+sqrt+" X "+sqrt);
			z=2;
			}
		else {
			System.out.println("You entered a list of "+num+" numbers.\n"
					+ "This list does not make a square matrix, please try again.");
			}
		}while(z==1);

		
		
		
		
		int[][] matrix = new  int[sqrt][sqrt];
		
		MatrixBuilder mb = new MatrixBuilder(sqrt);
		int[][] result = mb.fill(intArray);
		magic=mb.testForMagic(result);
		if(magic){
			System.out.println("true");
			}
		else
			System.out.println("false");
		}
}
	

