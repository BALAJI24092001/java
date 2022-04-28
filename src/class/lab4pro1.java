public class lab4pro1{
	public static void main(String[] args) {
		countClass obj1 = new countClass();
		countClass obj2 = new countClass();
		countClass obj3 = new countClass();
		System.out.println(countClass.countVal());
	}
}

class countClass{
	static int count;

	// increment using constructor
	countClass(){++count;}

	// static function to print number of objects created for this class
	static int countVal(){return count;}
}
