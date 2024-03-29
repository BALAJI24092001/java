import java.io.*;
import java.util.*;
// Anonymous class
class A{
	public void show(){
		System.out.println("Booyah!!");
	}
}

class B{
	public void show(){
		System.out.println("Hooray!!");
	}
}

@FunctionalInterface // we can have only one method in this interface
interface inf{
	int num = 5; // In inteface variables are by default final(constant)


	void show();// methods in inteface are by default abstract with default access specifier 

	// usually we cannot define a method in inteface but in java 1.8
	// it is possible with default keyword
	default void working(){ // no error
		System.out.println("In interface default method");
		// In functional interfaces we can have any number of default methods
		// but only one abstract method
		// we can override default methods too, but not mandatory like abstract methods
	// we can use static methods in interfaces, we can directly call them with interface reference
	}
}

public class Day10{
	public static void main(String[] args) {


		// to override only one method of class A we created class B
		// Insted of creating another we can just use Anonymous public class Day10
		A obj = new A(){ // we can create an object of an instance
			// using anonymous class
			public void show(){
				System.out.println("Legendary!!");
			}
		}; // need to put ';' while ending an anonymous class
		obj.show();




		inf infObj = () -> {
			System.out.println("while in anonymous class we use 'new A(){}'.");
			System.out.println("because we need to specify what function we are overriding with what code");
			System.out.println("But for functional intefaces we only have one function to override.");
					System.out.println("so we dont have to define the object with new inf() and dont even have to write the function name");
		};
		inf infObj2 = () -> System.out.println("this is lamda expression");
		infObj2.show();




		// Exception handling
		try{
			int[] a = new int[]{1, 2, 3, 4, 5, 6};

			int i = 6;
			int j = 0;
			int k = i/j;
		}
		catch(Exception e){ // we can use the reference ArithmeticException
			System.err.println("Error");
		}
		finally{ // this block will get excecuted if try throws an exception or not
			// helpful to reduce redunduncy in code
			System.out.println("Bye");
		}
		System.out.println("End Exception");




		// multiple catch blocks
		try{
			int i = 0;
			int k = 1/i;
		}
		catch(ArithmeticException e){ // we can club both the exceptions as
		// catch(ArithmeticException | IndexOutOfBoundsException e){ System.out.println("Error "); }
			System.out.println("ArithmeticException ");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException for array index out of bound");
		}
		catch(Exception e){
			System.out.println("Every possible other exception");
		}
		finally{
			System.out.println("Thaggedhe le");
		}




		// trying user defined exception
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader( System.in )); // import java.io.*; to import BufferedReader and InputStreamReader
			int n = Integer.parseInt(br.readLine());
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}



		// Input using scanner
		Scanner sc = new Scanner(System.in); // Instead of using BufferedReader and InputStreamReader
		// we can directly use Scanner function to makes things easy
		System.out.println( sc.nextInt());
		sc.close();
		// There is no need to close the scanner. Not closing might generate some warnings although. 
		// As soon as the block in which you defined Scanner object is over the garbage collection does your job for you.

		// newInt will input next integer, if there is no integer, gives compiler error
		// newLine will input whole line(with out the next line charecter "\n") into a string
		// hasNew will return boolean values, true, if there is input from user else gives false
		// hasNewLine, return true, if there is new line

	}
}


// Types of inteface
// 1. Normal - Interface with more that one function declaration
// 2. Single abstract method interface - Have only one method(from java 8, it is called functional interface)
// for compile time validation there is an annotation @FunctionalInerface
// 3. Marker interface - Interface with no methods
//
//
// Access specifiers
// Note: 
// 1. If we want to use the default specified variables in other packages with objects
// we have to specify the variable as public, else in other packages, the variable is not visible
