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
		fibbonaci(5);
		cal(8, 4);

		System.out.println(fact(4));
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
	static void fibbonaci(int n){
		int l1 = 0;
		int l2 = 1;
		if(n >0){
			System.out.print("1, ");
		}
		for (int i = 1; i < n; i++) {
			int sum = l1 + l2;
			if(i == n-1){
				System.out.println(sum);
				break;
			} else{
				System.out.print(sum + ", ");
			}
			l1 = l2;
			l2 = sum;
		}
	}

	// 3. Arithmetic operations
	static void cal(int val1, int val2){
		int add = val1 + val2;
		int sub = val1 - val2;
		int div = val1 / val2;
		int mul = val1 * val2;
		System.out.println("Addition of given two numbers is : " + add);
		System.out.println("Multiplication of given two numbers is : " + mul);
		System.out.println("Subtraction of given two numbers is : " + sub);
		System.out.println("Division of given two numbers is : " + div);
	}
	

	// Combination value(Ncr)
	static int comb(int n, int r){
		return fact(n) / ( fact(n-r) * fact(r) );
	}

	// factorial function
	static int fact(int val){
		if(val != 1){
			return val*fact(val-1);
		} else{
			return 1;
		}

	}

}	
