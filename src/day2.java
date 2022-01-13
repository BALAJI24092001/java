public class day2 {
	public static void main(String[] args) {
		// CONDITIONAL STATEMENTS
// --------------------------------------------------------------------------------


		// if block
		/* --------------------------------------- */



		int n = 7;
		System.out.println("If else block");
		if (n%2 == 0)
			System.out.println("n is even");
		else // we can remove else block and use only if block if needed
			System.out.println("n is odd");
		// For single line conditional statements, {} are not necessary.
		// The conditional statements considers the below provided line to be the only line and don't execute the remining.
		System.out.println("-----------------------------------------");


		n = 0;
		System.out.println("Nested if else block");
		if (n == 0) {
			System.out.println("n value is 0");
			System.out.println("If we have multiple lines in a single block, we have to mention them inside {} braces.");

		} if (n%2 == 0) {
			System.out.println("n is even");
		} else {
			System.out.println("n is odd");	
		} // the braces can be removed in above block


		// switch
		// -----------------------------------------
		



		// problem: print 1 if n = 1, simillarly print the name untill n = 7;
		switch(n){ // in java 1.8 and above, the variable n is also allowed to be a String data type. Floats values are not allowed in switch statements.
			// simillar to cpp
		
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Number is not in the available range.");
		}


		// ternary
		// -------------------------------------------

		int i = 6;
		int j = 2;
		j = (i > 4) ? 1: 0;
		System.out.println("j value is :" + j);
	
		 



		// LOOPS
// ----------------------------------------------------------------------------------

		// while
		i = 0;
		while (i <= 5) {
			System.out.println("while loop: " + i);
			++i;
		}

		// do-while
		i = 0;
		do {
			System.out.println("Do while loop: " + i);
		} while (i < 5);

		// for
		for (i = 0; i < 5; i++) {
			System.out.println("for loop: " + i);
		} // for loop is used when we know both the upper and lower limit	

		// for - each
		
		
	}

}
