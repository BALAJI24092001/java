//We use the integers a, b, and n to create the following series:
//
//for i=0 to i<t  (a + (1+1)^i * b)
//
//You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
//Input Format
//
//The first line contains an integer, q, denoting the number of queries.
//Each line i of the q subsequent lines contains three space-separated integers describing the respective a sub(i), b sub(i), n sub(i) and  values for that query.
//
//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.


import java.util.*;
import java.io.*;

class que005{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
	int[] a = new int[t];
	int[] b = new int[t];
	int[] n = new int[t];
        for(int i=0;i<t;i++){
            	a[i] = in.nextInt();
            	b[i] = in.nextInt();
            	n[i] = in.nextInt();    
        }
	int index = 0;
	for (int var : n) {
		for(int j=0; j < var; j++){	
			int temp = 0;
			for(int k = 0; k <= j; k++){
				temp = temp + (int)Math.pow(2, k)*b[index];
			}
			System.out.print( (a[index]+temp) + " ");
		}
		System.out.println();
		index++;
	}
        in.close();
    }
}
