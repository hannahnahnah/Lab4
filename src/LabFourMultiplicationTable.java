import java.util.Scanner;

public class LabFourMultiplicationTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("OooohLaLa! A Multiplication Table!\n");
		
		System.out.print("Enter an integer: ");
		int tableSize = scnr.nextInt();
		System.out.println();
	        
	    printMultiplicationTable(tableSize);
	    }
	     
	    public static void printMultiplicationTable(int tableSize) {
	    	Scanner scnr = new Scanner(System.in);
	    	String userContinue = "y";
	    	
	    	
	        System.out.format("      ");
	        for (int i = 1; i <= tableSize; ++i ) {
	            System.out.format("%4d",i);
	        }
	        
	        System.out.println();
	        System.out.println("------------------------------------------");
	         
	        for (int i = 1 ;i <= tableSize; ++i) {
	            System.out.format("%4d |", i);
	            for (int j = 1; j <= tableSize; ++j) {
	                System.out.format("%4d", i * j);
	            }
	            System.out.println();
	    	} 
	      
	    } 	
} 
	


