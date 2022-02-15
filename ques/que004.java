//Input Format
//
//Every line of input will contain a String followed by an integer.
//Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range 0 from 999 to .
//
//Output Format
//
//In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly 15 characters.
//The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.


// Sample input
// java 100
// cpp 65
// python 50


import java.util.Scanner;

public class que004 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
	    String[] s1 = new String[3];
	    int[] x = new int[3];
            for(int i=0;i<3;i++)
            {
                s1[i] =sc.next();
                x[i] =sc.nextInt();
                //Complete this line
            }
            System.out.println("================================");
	    for (int i = 0; i < 3; i++) {
		System.out.printf("%-15s%03d%n", s1[i], x[i]);
	    }
	    sc.close();
            System.out.println("================================");

    }
}


// Sample output
//
//
// ================================
// java           100
// cpp            065
// python         050
// ================================

