public class day3{
	public static void main(String[] args) {

		// build a right triangle with sequential numbers
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " "); // replace j with "*" for * based right triangle pattern
			}
			System.out.println();
		}
		// output :
		// 1 
		// 1 2 
		// 1 2 3 
		// 1 2 3 4 
		// 1 2 3 4 5 
		// 1 2 3 4 5 6 

		System.out.println();

		// build a right triangle with capital alphabets
		char temp = 'A';
		for (int i = temp; i < (int)temp + 5; i++) {
			for (int j = temp; j <= i; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		// output :
		// A 
		// A B 
		// A B C 
		// A B C D 
		// A B C D E

		System.out.println();

		//  build a squre box with "$" as border
		int max = 4;
		for (int i = 1; i <= max; i++) {
			if(i == 1 || i == max){
				for (int j = 1; j <= max; j++) {
					System.out.print("$ ");
				}
				System.out.println();
			}
			else{
				System.out.print("$ ");
				for (int j = 1; j <= (max - 2); j++) {
					System.out.print("  ");
				}
				System.out.println("$ ");
				
			}
		}
		// output :
		// $ $ $ $ 
		// $     $
		// $     $ 
		// $ $ $ $ 
		
		System.out.println(); // break and continue escape statements similar to cpp
		// in simple statements: 
		// break : To break the loop
		// continue : To skip an iteration of loop



	}
}
