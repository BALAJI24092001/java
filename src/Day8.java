public class Day8{
	public static void main(String[] args) {
		int temp =5; // this variable is declared in main fucntion of the class, so this is not available to other 
		System.out.println(temp);
//		Access Specifier
//		1. public	-  globlally accessible
//		2. private	-  accessible within the package(including the subclasses declared outside the package)
//		3. protected	-  accessabe only within the class it is defined
//		4. default	-  accessible within same class and package within which its class is defined.

	}

	class test{
		public static int testing; // can be accessed without creating an object since declared public
		int temp ;
		static int temp1;
		// same variable is shared between all objects of the class
		public test(int n){
			testing = 10;
			this.temp = 5;
		}
		static{
			temp1 = 5;
		}
		public static void main(String[] args) {
			System.out.println(temp); // error
			// cannot use a not static variable in a static function
			// static references creates only one instance per class
			// whereas non static ref's created on instance per object.
		}
		public void cls(){
			System.out.println(temp);
		}
	}
}

class Sum{ // example for polymorphism

	// overloading of sum function
	// constructor overloading is also possible
	public int sum(int x, int y){
		return(x + y);
	}
	public int sum(int x, int y, int z){
		return(x + y + z);
	}
	public double sum(double x, double y){
		return(x + y);
	}
}
