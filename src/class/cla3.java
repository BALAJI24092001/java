import java.util.Scanner;
public class cla3{

	public static void main(String[] args) {
		// constant is a fixed values and cannot be changed while running the program
		// varaible: represents storage location.
		byte byt = 1;
		short sht = 500;
		int in = 400000;
		long lng = 500003030;
		
		char chr = 'c';
		String str = "Balaji\nAbhiram";

		float flt = 5.9f;
		double dbl = 999.999;

		System.out.println("byte: " + byt +"\nshort: " + sht + "\nint: " + in + "\nlong: " + lng + "\n" );
		System.out.println("char: " + chr + "\nString: " + str + "\n");
		System.out.println("float: " + flt + "\ndouble: " + dbl);



		Scanner inp = new Scanner(System.in);
		String str1, str2;
		str1 = inp.next();
		str2 = inp.next();
		
		// string operations, arguments from command line
		System.out.println( strOp(str1, str2, "concat") );
		System.out.println( strOp(str1, str2, "len") );
		System.out.println( strOp(str1, str2, "lowerCase") );
		System.out.println( strOp(str1, str2, "upperCase") );
		System.out.println( strOp(str1, str2, "compare") );
		System.out.println( strOp(str1, str2, "else") );
	

		// sort array, arguments from command line
		System.out.print("Enter size of the array: ");
		int size = inp.nextInt();
		int[] array = new int[size];
		for(int i = 0; i<size; i++){
			array[i] = inp.nextInt();
		}
		int[] sortedArray = bubbleSort(array);
		for(int i: sortedArray){
			System.out.print(i + ", "); 
		}
		System.out.println();

		// Arithmeric operations, arguments from command line
		int val1, val2;
		val1 = inp.nextInt();
		val2 = inp.nextInt();
		arithmeticOperations(val1, val2, "add");
		arithmeticOperations(val1, val2, "sub");
		arithmeticOperations(val1, val2, "mul");
		arithmeticOperations(val1, val2, "div");
		arithmeticOperations(val1, val2, "mod");
		arithmeticOperations(val1, val2, "else");
	        	






		inp.close();
		// lab problems
		// write a program to do string operations(three command line arguments with 3rd argument being the string operation)
		// Declare a interger array, declare input from the user and sort the array.
		// Arithmetic operations using command line arguments
	}

	// 1. String operatons usin command line arguments
	static String strOp(String str1, String str2, String opr){
		if(opr == "concat"){
			return str1+str2;
		}
		else if(opr == "len"){
			return "Length of string 1 is : " + str1.length() + "\nLength of string 2 is : " + str2.length();
		}
		else if(opr == "lowerCase"){
			return "Lower case of string 1 is : " + str1.toLowerCase() + "\nLower case of string 2 is : " + str2.toUpperCase();
		}
		else if(opr == "upperCase"){
			return "Upper case of string 1 is : " + str1.toUpperCase() + "\nUpper case of string 2 is : " + str2.toUpperCase();
		}
		else if(opr == "compare"){
			return (str1 == str2)? "Same": "Not same";
		}
		return "Give an appropriate string operation";
	}
	
	// 2. Array sorting using command line arguments
	static int[] bubbleSort(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		    for (int j = 0; j < n-i-1; j++)
			if (arr[j] > arr[j+1])
			{
			    int temp = arr[j];
			    arr[j] = arr[j+1];
			    arr[j+1] = temp;
			}
		return arr;
    	}

	// 3. Arithmetic operations using command line arguments
	static void arithmeticOperations(int val1, int val2, String op){
		if(op == "add")
			System.out.println(val1 + val2);
		else if(op == "sub")
			System.out.println(val1- val2);
		else if(op == "div")
			System.out.println(val1/val2);
		else if(op == "mul")
			System.out.println(val1*val2);
		else if(op == "mod")
			System.out.println(val1%val2);
		else
			System.out.println("Wrong operations");
	}
}
