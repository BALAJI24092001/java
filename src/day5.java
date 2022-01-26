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


		// print a horizontal inverse of a right triangle
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < (height - i); j++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
		//output:
		// * * * * * 
		// * * * * 
		// * * * 
		// * * 
		// *


		// print reverse pyramid
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}	
			for (int j = 0; j < (height - i); j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		// * * * * * 
		//   * * * * 
		//     * * * 
		//       * * 
		//         * 
		

		// print right side of a pascal triangle with * pattern
		for (int i = 0; i < 2; i++) {
			if(i == 0){
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k <= j; k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else{
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < height - j; k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		}
		// output:
		// * 
		// * * 
		// * * * 
		// * * * * 
		// * * * * * 
		// * * * * 
		// * * * 
		// * * 
		// * 


		// print left side of a pascal triangle with * pattern
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < height - j - 1; k++) {
						System.out.print("  ");
					}
					for (int k = 0; k < j+1; k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else{
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < j + 1; k++) {
						System.out.print("  ");
					}
					for (int k = 0; k < height - j - 1; k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
		}
		// output:
		//         * 
		//       * * 
		//     * * * 
		//   * * * * 
		// * * * * * 
		//   * * * * 
		//     * * * 
		//       * * 
		//         * 

	}
}





// testing for-each loop performance issue with time difference using java.util inbuilt time functions

///*package whatever //do not write package name here */
//
//import java.io.*;
//import java.util.*;
//
//class GFG {
//	public static void main (String[] args) {
//		List<Integer> list = new ArrayList<>();
//		long startTime;
//		long endTime;
//		for (int i = 0; i < 1000000; i++) {
//			list.add(i);
//		}
//		// Type 1
//		startTime = Calendar.getInstance().getTimeInMillis();
//		for (int i : list) {
//			int a = i;
//		}
//		endTime = Calendar.getInstance().getTimeInMillis();
//		System.out.println("For each loop :: " + (endTime - startTime) + " ms");
//		
//		// Type 2
//		startTime = Calendar.getInstance().getTimeInMillis();
//		for (int j = 0; j < list.size(); j++) {
//			int a = list.get(j);
//		}
//		endTime = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");
//		
//		// Type 3
//		startTime = Calendar.getInstance().getTimeInMillis();
//		int size = list.size();
//		for (int j = 0; j < size; j++) {
//			int a = list.get(j);
//		}
//		endTime = Calendar.getInstance().getTimeInMillis();
//		System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");
//	
//		// Type 4
//		startTime = Calendar.getInstance().getTimeInMillis();
//		for(int j = list.size()-1; j >= 0; j--) {
//			int a = list.get(j);
//		}
//		endTime = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Using [int j = list.size(); j > size ; j--] :: " + (endTime - startTime) + " ms");
//	}
//}
//
//// This code is contributed by Ayush Choudhary @gfg(code_ayush)
//
