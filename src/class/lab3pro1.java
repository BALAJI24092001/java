public class lab3pro1{
	public static void main(String[] args) throws java.io.IOException{
		int[][] array1 = {
			{2, 3, 3, 2},
			{1, 2, 2, 1},
			{1, 2, 2, 1},
			{2, 3, 3, 2}
		};
		int[][] array2 ={
			{2, 2, 2, 2},
			{2, 2, 2, 2},
			{2, 2, 2, 2},
			{2, 2, 2, 2}
		};
		System.out.print("Enter a charecter for implementing a matrix operation: ");
		char choice = (char)System.in.read();
		int[][] ans = new int[array1.length][array1.length];
		switch (choice) {
			case 'm':
				// console output matrix multiplication
				ans = matrixMultiplication(array1, array2);
				printMatrix(ans, "Multiplication of two matrices");
				break;
			case 'a':
				// console output matrix addition
				ans = matrixAddition(array1, array2);
				printMatrix(ans, "Addition of two matrices");
				break;
			case 's':
				// console output matrix subtraction
				ans = matrixSubtraction(array1, array2);
				printMatrix(ans, "Subtraction of two matrices");
				break;
			default:
				System.out.println("Wrong operation input.");
		}
	}
	// matrix multiplication function
	static int[][] matrixMultiplication(int[][] arr1, int[][] arr2){
		int[][] ans = new int[arr1.length][arr1.length];
		for (int i = 0; i < arr1.length; i++) for (int j = 0; j < arr1.length; j++) {
			int sum = 0;
			for (int k = 0; k < arr1.length; k++) sum += arr1[j][k]*arr2[k][j];
			ans[i][j] = sum;
			}
		return ans;
	}

	// matrix addition
	static int[][] matrixAddition(int[][] arr1, int[][] arr2){
		int[][] ans =new int[arr1.length][arr1.length];
		for(int i = 0; i<arr1[0].length; i++) for (int j = 0; j < arr2.length; j++) ans[i][j] = arr1[i][j] + arr1[i][j];
		return ans;
	}

	// matrix subtraction
	static int[][] matrixSubtraction(int[][] arr1, int[][] arr2){
		int[][] ans = new int[arr1.length][arr1.length];
		for(int i = 0; i<arr1.length; i++) for (int j = 0; j < arr1.length; j++) ans[i][j] = arr1[i][j] - arr2[i][j];
		return ans;
	}

	// printing a 2d array
	static void printMatrix(int[][] arr, String message){
		System.out.println();
		System.out.println(message);
		for(int[] i: arr){
			System.out.print("| ");
			for(int j: i) System.out.print(j + " | ");
			System.out.println();
			for (int j = 0; j < arr.length; j++) System.out.print("-----");
			System.out.println();
		}
	}
}
