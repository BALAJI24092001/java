public class cla11{
	public static void main(String[] args) {
		C obj = new C();
		obj.print();
	}
}

class A{
	void output(){
		System.out.println("Hello in class A.");
	}
}

interface B{
	double pi = 3.14; // variables declared inside the interface is final
	// variable should be declared "static final double pi = 3.14"
	// but in interfaces the variables are always static final variables
	void print(); 
	// functions in interfaces are not definable only declarable
	// functions in interfaces cannot have body
	// functions in interfaces are abstract
}

interface B1 extends B{
	void print_output();

}

class C extends A implements B{
	public void print(){
		// pi = 2.14;
		// cannot be overriden, because pi is a final static variable
		System.out.println("Print from C class..");
	}
	public void print_output(){
		System.out.println("Print_output function in class C...");
	}
}

// interface
// all variables are final and all fucntions in interfaces are abstract.
// The class implementing the interface should override the abstract function form the interface
// The variables inherited from the interface cannot be overriden
