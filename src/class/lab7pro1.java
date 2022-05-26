import java.io.*;

public class lab7pro1{
    public static void main(String[] args) {

	// Exception 1
        try {
            FileReader file0 = new FileReader("file0.txt");
	    file0.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occured.");
        }
	catch(IOException e){
		System.out.println("IO Exception...");
	}
        
	// Exception 2
        try {
            FileWriter file1 = new FileWriter("file1.txt");
            File this_file = new File("file1.txt");
            if (this_file.setReadOnly())
                System.out.println("File1.txt made read-only.");
            file1.append('c');
	    file1.close();
        }
        catch (IOException e) {
            System.out.println("IOException occured.");
        }
        
	// Exception 3
        try {
            int a = 7, b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured.");
        }
        
	// Exception 4
        try {
            int num;
            num = Integer.parseInt("");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occured.");
        }
	
	// Exception 5
        try {
            int[] my_arr = {1,2,3};
            System.out.println(my_arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured.");
        }
    }
}
