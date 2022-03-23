public class cla1{
	public static void main(String[] args) {

		int val1= 1, val2 = 2;
		int tot = val1 + val2;


		// printing sum of numbers
		System.out.println("Sum of the given two numbers is : "+ tot);


		// Conditional statement
		if (tot > 20) {
			System.out.println("Pass");
		} else{
			System.out.println("Fail");
		}


		EvalPrime(2);
	}



	// Lab programs
	

	// 1. Find if the given number is a prime number
	static void EvalPrime(int val){
		boolean flag = true;
		if( val > 1 ) {
			for (int i = 2; i < val; i++) {
				if(val%i==0){
					System.out.println(val + " is not a prime number.");
					break;
				} else if(val == val-1){
					flag = true;
				}
			}
			if(flag == true){
				System.out.println(val + " is a prime number.");
			}
			
		}
	}


	// 2. Fibbonaci series
	// 3. Arithmetic operations
}	
