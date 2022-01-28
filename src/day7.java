public class day7{
	public static void main(String[] args) {
		// sandglass star pattern
		int max = 5;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < max - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

//		Output:
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 

		// Alphabet capital A
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max - i; j++) {
				System.out.print(" ");
			}
			if(i == ( (int)(max/2) )){
				for (int j = 0; j < (int)(max/2) + 1; j++) {
					System.out.print("*  ");
				}
				System.out.println();
				continue;
			}
			for (int j = 0; j < 1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Output:
//
//		     * * 
//		    *   * 
//		   *  *  *  
//		  *       * 
//		 *         * 

		// Hallow triangle star pattern
		for (int i = 0; i < max; i++) {
			if(i == (max - 1)){
				for (int j = 0; j < max + 1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else if(i == 0){
				for (int j = 0; j < max ; j++) {
					System.out.print(" ");
				}
				System.out.println("* ");
			}
			else{
				for (int j = 0; j < max - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 1; j++) {
					System.out.print("* ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("  ");
				}
				for (int j = 0; j < 1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

//		Output:
//		     * 
//		   *   * 
//		  *     * 
//		 *       * 
//		* * * * * * 

		// hallow diamond star pattern
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max - i - 1; j++) {
				System.out.print(" ");
			}
			if(i == 0)
				System.out.println(" *");
			else{
					System.out.print("* ");
				for (int j = 0; j < i; j++) {
					System.out.print("  ");
				}
					System.out.println("* ");
			}
		}
		for (int i = 0; i < max - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			if( i == max-2 )
				System.out.println(" *");
			else{
				System.out.print("* ");
				for (int j = 0; j < max - i - 2; j++) {
					System.out.print("  ");
				}
				System.out.println("* ");
			}
		}

// 		Output:
//		     *
//		   *   * 
//		  *     * 
//		 *       * 
//		*         * 
//		 *       * 
//		  *     * 
//		   *   * 
//		     *


		// Number patterns
		for (int i = 0; i < max; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j+1) + " ");
			}
			System.out.println();
		}

//		Output:
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		// Pascal triangle
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				int temp = fact(i)/( fact(i-j) * fact(j) ); // using factorial function
				if(temp > 9){
					System.out.print(temp + " ");
				}
				else
					System.out.print( temp + "   ");
			}
			System.out.println();
		}

//		Output:
//		        1   
//		      1   1   
//		    1   2   1   
//		  1   3   3   1   
//		1   4   6   4   1   

		System.out.println();

		for (int i = 0; i < max; i++) {
			if(i == 0){
				for (int j = 0; j < max; j++) {
					System.out.print(" ");
				}
				System.out.println(" " + (char)(65+i));
			}
			else{
				for (int j = 0; j < max - i; j++) {
					System.out.print(" ");
				}
				System.out.print( (char)(65+i) + " " );
				for (int j = 0; j < i; j++) {
					System.out.print("  ");
				}
				System.out.println( (char)(65+i) );
			}
		}
		for (int i = 0; i < max - 1; i++) {
			if(i == max - 2){
				for (int j = 0; j < max; j++) {
					System.out.print(" ");
				}
				System.out.println(" " + (char)(65 + max -2 - i));
			}
			else{
				for (int j = 0; j <= i + 1; j++) {
					System.out.print(" ");
				}
				System.out.print((char)(65 + max -2 -i)+ " ");
				for (int j = 0; j < max - i - 2; j++) {
					System.out.print("  ");
				}
				System.out.println((char)(65 + max - 2 - i));
			}
		}

//		Output:
//		      A
//		    B   B
//		   C     C
//		  D       D
//		 E         E
//		  D       D
//		   C     C
//		    B   B
//		      A

	}

	// for pascal triangle pattern
	public static  int fact(int n){
		if(n == 1 || n == 0){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}
