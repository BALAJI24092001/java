public class day5{
	public static void main(String[] args) {
		// problems related to patterns
		//
		// Print a equilateral triangle with height 5
		int height = 5;
		for (int j = 1; j <= height; j++) {
			for (int k = 1; k <= (height - j); k++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= (2*j- 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// output :
		//        * 
		//      * * * 
		//    * * * * * 
		//  * * * * * * * 
		// * * * * * * * * * 


		// print a diamond shape of top height 5
		for (int i = 0; i < 2; i++) {
			if(i == 0){
				for (int j = 1; j <= height; j++) {
					for (int k = 1; k <= (height - j); k++) {
						System.out.print("  ");
					}
					for (int k = 1; k <= (2*j- 1); k++) {
						System.out.print("* ");
					}
				System.out.println();
				}
			}
			else{
				for (int j = 0; j < (height - 1); j++) {
					for (int k = 0; k < (j + 1); k++) {
						System.out.print("  ");
					}
					for (int k = 0; k < 2*(height - j - 1) - 1; k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		}
		// ouput:
		//         * 
		//       * * * 
		//     * * * * * 
		//   * * * * * * * 
		// * * * * * * * * * 
		//   * * * * * * * 
		//     * * * * * 
		//       * * * 
		//         * 
	}
}
