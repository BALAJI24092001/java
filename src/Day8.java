class sumTest{ // example for polymorphism

	int i;
	int j;

	// fucntion overloading, constructors can also be overloaded
	public int sum(int x, int y){
		return(x + y);
	}

	public int sum(int x, int y, int z){
		return(x + y + z);
	}

	public double sum(double x, double y){
		return(x + y);
	}

	public sumTest(){
		// default constructor
		System.out.println("default constructor executed 'using constructor chaining: at level 0'");
	}

	public sumTest(int i){
		this();
		System.out.println("constructor overloaded with single parameter 'constructor chaining: at level 1.'"); 
		// also used constructor chaining by calling default constructor using this() keyword
		this.i = i;
	}

	public sumTest(int i, int j){
		this(i);
		System.out.println("constructor overloaded with two parameters 'constructor chaining: at level 2'");
	}


}

class sampleSum extends sumTest{

	// creating a class inherited from another class to use super() to call constructor of parent class.
	// comes under constructor chaining
	public sampleSum(){
		System.out.println("In child class constructor.");
	}

	public sampleSum(int i){
		super(i);
		System.out.println("In child class overloaded constructor(with one parameter)");
	}
} 

// singleton class to show private constructors.
// a class which can have only one instance.
class singleton{
	private singleton(){

	} // a singleton class constructor must be declared as private else any number of instances can be created for this class

	static singleton instance;
	public static singleton getInstance(){
		if(instance == null)
			instance = new singleton();
		return instance;
	}
}


public class Day8{
	int stc = 0;
	public static void main(String[] args) {
		int temp =5; // this variable is declared in main fucntion of the class, so this is not available to other 
		System.out.println(temp);
//		Access Specifier
//		1. public	-  globlally accessible
//		2. private	-  accessible within the package(including the subclasses declared outside the package)
//		3. protected	-  accessabe only within the class it is defined
//		4. default	-  accessible within same class and package within which its class is defined.

//	initializing a class 
	sumTest temp0 = new sumTest(); // general initialization
//	sumTest temp1 = (sumTest)Class.forName("Day8.sumTest"); // Given it is stored in a package
	// error with .forname class initialization method
	}

	class test{ // inner class

		static int testing;
		int temp ;
		static int temp1;
		// same variable is shared between all objects of the class since declared static
		
		static{ // static block is called only once when the JVM loads the class for the first time
			System.out.println("static block of test class is executed");
			temp1 = 100;
		}

		{ // this is init block, which is called every time an object of this class is created
			System.out.println("init block is executed");
		}

		public test(int n){
			testing = 10; 
			// a Static variable cannot be hadled with `this` keyword, since static variable are class specific not object specific
			// and it is always suggest to initialize static variable in static block
			this.temp = 5;
		}
		static{
			temp1 = 5;
		}
		public static void main(String[] args) {
			System.out.println(temp); // error
			// cannot use a not static variable in a static function
			// static references creates only one instance per class
			// whereas non static ref's created per each instance of a class.
		}
		public void cls(){
			System.out.println(temp);
		}
	}
}
