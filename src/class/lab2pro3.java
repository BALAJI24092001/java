public class lab2pro3{
	public static void main(String[] args) {
		int val1 = Integer.parseInt( args[0] );
		int val2 = Integer.parseInt(args[1]);
		String val3 = args[2];

		arithmeticOperations(val1, val2, val3);
	}
	
	// 3. Arithmetic operations using command line arguments
	static void arithmeticOperations(int val1, int val2, String op){
		if("add".equals(op))
			System.out.println(val1 + val2);
		else if("sub".equals(op))
			System.out.println(val1- val2);
		else if("div".equals(op))
			System.out.println(val1/val2);
		else if("mul".equals(op))
			System.out.println(val1*val2);
		else if("mod".equals(op))
			System.out.println(val1%val2);
		else
			System.out.println("Wrong operations");
	}
}
