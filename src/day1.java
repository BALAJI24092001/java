
public class day1 {
	
	public static void main(String args[]) {
		System.out.println("Hello World");

// break

		int a = 5; // interger 4 bytes -> 32 bits(8 * 4) -> -2147483648 to 2147483647.
		float b = 1;
		char c = 'c';
		double d = 4;
		short s = 5;
		long l = 500000000000000l; // l at end indicating long type of number.
		boolean x = true;
		byte bt = 5; // 1 byte -> 8 bits -> -128 to 127
		System.out.println("The value of a before changing: ");
		System.out.println(a);
		a = 10;
		System.out.println("The value of a after changing: ");
		System.out.println(a);
		c = 66;  // c is a char, implicitly converted to character based on ASCII cenventions.
		System.out.println(c); // based on ASCII(Americann Standard code for information inteterchange) it will print 'B'.
		/*Upper case alphabets start from 65 and smaller case starts from 97.
		Any same alphabets of 2 different case differ by value 32.*/
		//This above mentioned comment is a multiline comment written using < /*.....content....*/ > 
		//whereas single line comments are written using (\\)
// break

		/*
		 *
		 * Arithmetic +, -, *, /, %
		 * Bitwise
		 * Relational
		 * Logical
		 *
		*/
		int m = 10, n=4;
		int r1 = m + n;
		int r2 = m - n;
		System.out.print("Sum of m and n is: m+n = " + r1);
		System.out.print("Sum of m and n is: m+n = " + r2);
		// pre increment and post increment, same as cpp.

// break
		balaji();
	}
	
	public static void balaji() {
		System.out.println("Hello balaji!!");
	}
	

}


