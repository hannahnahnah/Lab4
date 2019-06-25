import java.util.Scanner;


public class LabFourTableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userInput;
		String userContinue;
		
		System.out.println("Learn your squares and cubes!\n");
		
		do {
		
			System.out.print("Enter an integer: ");
				userInput = scnr.nextInt();
				System.out.println();
				
				System.out.printf("%-10s    %-10s    %-10s \n", "Number", "Squared", "Cubed");
				System.out.printf("%-10s    %-10s    %-10s \n", "=======", "=======", "=======");
		
				for (int i = 1; i <= userInput; ++i) {
					System.out.printf("%-10d    %-10d    %-10d \n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
					
				}
				
				System.out.println();
				System.out.print("Continue? (y/n): ");
					userContinue = scnr.next(); 
					System.out.println();
				
		} while (userContinue.equals("y") || userContinue.equals("Y"));
		
		
		System.out.println("Adios.");
		
		
		
		
	}

}
