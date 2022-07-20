package Demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int choice;
	    Double num1, num2, res = null;

	    while(true) {
	    	 System.out.println("1. Addition");
	         System.out.println("2. Subtraction");
	         System.out.println("3. Multiplication");
	         System.out.println("4. Division");
	         System.out.println("5. Exit");
	         // Enter the operation to be performed
	         System.out.print("Enter Your Choice (1-5): ");
	         choice = obj.nextInt();
	         
	    	switch (choice) {
	    	case 1 :
	    		// Enter Input numbers
		         System.out.println("Enter first number: ");
		 	     num1 = obj.nextDouble();

		 	     System.out.println("Enter second number: ");
		 	     num2 = obj.nextDouble();
	    		res = num1 + num2; 		// performs addition between numbers
	    		System.out.println(num1 + " + " + num2 + " = " + res);
	    		break;

	    	case 2 :
	    		// Enter Input numbers
		         System.out.println("Enter first number: ");
		 	     num1 = obj.nextDouble();

		 	     System.out.println("Enter second number: ");
		 	     num2 = obj.nextDouble();
	    		res = num1 - num2;		// performs subtraction between numbers
	    		System.out.println(num1 + " - " + num2 + " = " + res);
	    		break;

	    	case 3 :
	    		// Enter Input numbers
		         System.out.println("Enter first number: ");
		 	     num1 = obj.nextDouble();

		 	     System.out.println("Enter second number: ");
		 	     num2 = obj.nextDouble();
	    		res = num1 * num2;		// performs multiplication between numbers
	    		System.out.println(num1 + " * " + num2 + " = " + res);
	    		break;

	    	case 4 :
	    		// Enter Input numbers
		         System.out.println("Enter first number: ");
		 	     num1 = obj.nextDouble();

		 	     System.out.println("Enter second number: ");
		 	     num2 = obj.nextDouble();
	    		res = num1 / num2;		// performs division between numbers
	    		System.out.println(num1 + " / " + num2 + " = " + res);
	    		break;
	    		
	    	case 5:
	               return;

	    	default:
	    		System.out.println("\n Invalid Choice!");
	    		break;
	    	}
	    	if(choice>=1 && choice<=4) {
	    	System.out.println("\nResult = " +res+ "\n");
	    	}
	    }
	}
}
