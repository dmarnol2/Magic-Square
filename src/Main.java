import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		int sqrt;
		boolean isMagic;
		int[] intArray;
		String[] strArray;
		int exit=0;
		
		Scanner scan = new Scanner(System.in);
				
		do{
			System.out.println("Type in a list of numbers then press enter: ");
			String input = scan.nextLine();
			strArray = input.split("\\W");
			
			intArray = new int[strArray.length];
			for (int k=0; k<strArray.length;k++){
				intArray[k]=Integer.parseInt(strArray[k]);
				}
			
			int check=checkDuplicates(strArray);
			
			while (check==0){
				System.out.println("Type in a list of numbers then press enter: ");
				input = scan.nextLine();
				strArray = input.split("\\W");
				
				intArray = new int[strArray.length];
				for (int k=0; k<strArray.length;k++){
					intArray[k]=Integer.parseInt(strArray[k]);
					}
				
				check=checkDuplicates(strArray);
				} // end while loop
			
			int num = strArray.length;
			sqrt = (int) Math.sqrt(num);
			if(sqrt*sqrt == num) {
				System.out.println("You created the following "+sqrt+" X "+sqrt+ " matrix: ");
				exit=1;
				}
			else{
				System.out.println("You entered a list of "+num+" numbers.\n"
					+ "This list does not make a square matrix, please try again.");
				}
			}while(exit==0);    // end do while loop
		
		scan.close();
		
		MatrixBuilder mb = new MatrixBuilder(sqrt);
		
		int[][] result = mb.fillMatrix(intArray);
		
		isMagic=mb.testForMagic(result);
		
		if(isMagic){
			System.out.println("true");
			}
		else
			System.out.println("false");
	}
		
	
	public static int checkDuplicates(String[] array){
		
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : array) {
			if(!set.add(arrayElement)) {
				System.out.println("You entered the number "+arrayElement+" more than once. Please try again.");
				return 0;
				}
			} // end for loop
		return 1;
	}
} // end class
	

