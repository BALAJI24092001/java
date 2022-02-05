import java.text.DecimalFormat;
public class Day1 {
	
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
		System.out.println();
		System.out.print("Sum of m and n is: m+n = " + r2);
		// pre increment and post increment, same as cpp.

// break
		balaji();
		


		// String format function
		
		// Format specifies are similar to C and C++
		String str1 = String.format("%d", 101);  
		String str2 = String.format("|%10d|", 101);  // Specifying length of integer // right justified to the length 
		String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
		String str4 = String.format("|% d|", 101);   
		String str5 = String.format("|%010d|", 101); // Filling with zeroes          

		System.out.println(str1);  
		System.out.println(str2);  
		System.out.println(str3);  
		System.out.println(str4);  
		System.out.println(str5);  


		// Decimal format class
		//
		double i = 123.56;
		DecimalFormat ft = new DecimalFormat("##"); // without fraction part, aslo can use typecast to int
		System.out.println(ft.format(i)); // also restrict integer part to two places
		ft = new DecimalFormat("###.#"); // restrict decimal part to one place
		System.out.println(ft.format(i)); 
		ft = new DecimalFormat("####.0000"); // appends zeros to right
		System.out.println(ft.format(i));
		ft = new DecimalFormat("00000.0000"); // formatting numeric part
		System.out.println(ft.format(i));
		ft = new DecimalFormat("$###,###.####"); // money number formatting
		i = 123456.4321;
		System.out.println(ft.format(i));
}
	
	public static void balaji() {
		System.out.println();
		System.out.println("Hello balaji!!");
		System.out.println();
		System.out.println();
	}
	

}


