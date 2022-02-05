// user defined exception example
public class UserDefinedException extends Exception{
	public static void main(String[] args) {
	}
	public UserDefinedException(String s){
		super(s);
		// we are passing the string s to constructor of Exception class constructor
		// and the Exception class constructor through to its super class Throwable
		// the Throwable class will store it in a private string 'detailed message'
	}
}
