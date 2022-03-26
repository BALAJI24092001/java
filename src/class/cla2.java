public class cla2{
	public static void main(String[] args) {
		
		primeNum(27);
		fibonacci(11);
		calc(9, 4, "sub");
	}

	// 1. Prime numbers
	static void primeNum(int num){
		boolean flag = true;
		for(int i=2; i<num; i++){
			if(num % i == 0){
				System.out.println(num + " is not a prime number");
				flag = false;
				break;
			} else if(i == num -1)
				flag = true;
		}
		if(flag == true)
			System.out.println(num + " is a prime number");
	}

	// 2. Fibonacci sequence
	static void fibonacci(int num){
		int l1 = 0, l2 = 1;
		int i = 0;
		if(num == 1 || i == 0){
			System.out.print("1, ");
			i++;
		}
		for(; i< num; i++){
			int sum = l1 + l2;
			if (i == num-1){
				System.out.println(sum);
				break;
			}
			System.out.print(sum + ", ");
			l1 = l2;
			l2 = sum;
		}
	}

	// 3. Arithmetic operations
	static void calc(int val1, int val2, String op){
		if(op == "add")
			System.out.println(val1 + val2);
		if(op == "sub")
			System.out.println(val1- val2);
		if(op == "div")
			System.out.println(val1/val2);
		if(op == "mul")
			System.out.println(val1*val2);
	}

}
