import java.util.Scanner;
public class lab1pro3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=0,b=1, c;
        System.out.println("How many nos. of the Fibonacci series do you want to print?? ");
        int n=inp.nextInt();
	inp.close();
        for(int i = 0;i < n;i++)
        {
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
	System.out.println();
    }
}

