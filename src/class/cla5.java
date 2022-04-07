import java.util.Scanner;
public class cla5{
	public static void main(String[] args)throws java.io.IOException {
		
		// operators
		
		// Unary operators: 
		// (++a, --a) prefix increment/decrement opreator
		// (a++, a--) postfix increment/decrement operator
		// + - plus
		// - - minus
		// ~ - bitwise complement operator
		// ! - logical complement
		// () - type case operator
		//
		// Arithmetic operators:
		// + - Addition
		// - - Subtraction
		// * - Multiplication
		// / - Division
		// % - Modulus
		//
		// Relational operators:
		// == - equality operator
		// < - less than
		// > - greater than
		// <= - less than or equal to
		// >= - greater than or equal to
		//
		// Logical operators:
		// && - and
		// || - or
		

		// Applying unary operators
		byte value1 = 10;
		System.out.println("Applying unary operators on (value1 = 1) gives : ");
		System.out.println("i++ gives : " + value1++);
		System.out.println("i-- gives : " + value1--);
		System.out.println("++i gives : " + ++value1);
		System.out.println("--i gives : " + --value1);
		System.out.println(" -i gives : " + (-value1));
		System.out.println("i+i gives : " + (value1+value1));
		System.out.println(" ~i gives : " + ~value1);
		System.out.println(" !i gives : " + !true);
		System.out.println("(float)i  : " + (float)value1);

		// Applying arithmetic opearations
		int value2 = 5;
		System.out.println("sum operator : " + (value1 + value2));
		System.out.println("sub operator : " + (value1 - value2));
		System.out.println("mul operator : " + (value1 * value2));
		System.out.println("div operator : " + (value1 / value2));
		System.out.println("mod operator : " + (value1 % value2));

		// instanceof comparision operator
		cla5 obj = new cla5();
		System.out.println(obj instanceof cla5);

		// Decision making and branching statments : Conditional branching
		// if-else, else-if, switch, ternary operator
		
		// write a program to get the name of the student and his marks in physics, chemistry and mathematics.
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the student name : ");
		String studentName = inp.nextLine();
		System.out.print("Enter marks in physics : ");
		byte phyMarks = inp.nextByte();
		System.out.print("Enter marks in chemistry : ");
		byte cheMarks = inp.nextByte();
		System.out.print("Enter marks in Mathematics : ");
		byte matMarks = inp.nextByte();

		System.out.println(studentName + " your result is : ");
		if(phyMarks>= 50 && cheMarks>=40 && matMarks>=60){
			int avg = (phyMarks + cheMarks + matMarks)/3;
			if(avg > 90){
				System.out.println("'A' grade");
			} else if( avg > 80 ){
				System.out.println("'B' grade");
			} else if(avg > 70){
				System.out.println("'C' grade");
			} else if(avg > 60){
				System.out.println("'D' grade");
			} else{
				System.out.println("Fail");
			}
		} else if(phyMarks >= 50 && cheMarks >= 40 && matMarks < 60){
			System.out.println("Average of phy and chem marks is : " + (phyMarks + cheMarks)/2 );
		}
		inp.close();
		
		String a = "Balaji";
		switch(a){
			case "Balaji":
				break;
			case "Laddu mowa":
				break;
			case "Paul anna":
				break;
		}
		// enum is a user defined data type
		enum DAY{SUNDAY,MONDAY,TUESDAY}
		// perform two dimensional matrix addition subtration and multiplication.
	}
}
