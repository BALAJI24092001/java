public class Day9{
	public static void main(String[] args) {
		Day9 temp = new Day9();

		// A non static method can be called by a static method by creating an object
		System.out.println(temp.add(1, 2, 3, 4, 5)); 

		calculator temp1 = new calculator();
		advCalc temp2 = new advCalc();

		System.out.println(temp1.add(1, 2));
		System.out.println(temp2.add(1, 2)); // AdvCalc inherited add fucntion

		// wrapper class
		//
		// Using Objects of classes of primitive data types instead of variables
		// We use Classes of primitive data types called Wrapper classes to store the data
		// instead of the primitive data types
		//
		int i = 5;
		Integer i1 = Integer.valueOf(i); //new Integer(i); // boxing or wrappinng
		int j1 = i1.intValue(); // unboxing or unwrapping

		Integer i2 = i; // autoboxing, which will internallu do the boxing method
		int j2 = i1; // auto-unboxing

		// primitive data types are faster then wrappers

		String str = "123";
		System.out.println(Integer.parseInt(str));

		// using derived class object reference to parent class object is called upcasting.
		
//		human temp3 = new human(); // error
		man temp4 = new man();

	}

	public int add(int ... i){ // `...` representst varargs
		// it is also called variable length arguments
		// we can send any number of values to the function
		// the functions stores them as array in the variable i
		// so we use for each loop lo add the values
		int sum = 0;
		for (int var : i) {
			sum = sum + var;	
		}
		return sum;
	}
}


class calculator{ // Base class
	public int add(int i, int j){
		System.out.println("In parent class add fun.");
		return i + j;
	}
}

// Derived class level 1
class advCalc extends calculator{ // this is a subclass inherited add function from Calculator class
	// 
	// single inheritance
	//
	public int sub(int i, int j){
		return i - j;
	}

	@Override // annotaitons in java
	// if we intend to overide the add function but we made a mistake in name the funcion same
	// Then we will get error if we use the @Override annotaiton
	// name the function add1 instead of add by mistake
	// To avoid this error we use annotaitons
	// using the @overide will give compile time error
	// while using no annotaiton will leave the error undetected and leads to unwanted results
	public int add(int i, int j){
		System.out.println("using super.add() fucn: " +  super.add(1, 2));
		System.out.println("In der lev 1 add fucntion.");
		return i + j;
	}
}

// Derived class level 2
class advAdvClass{
	//
	//multilevel inheritance
	//
	public int mul(int i, int j){
		return i*j;
	}
}

// Abstract class and final keyword
abstract class human{ // objects of this calss cannot be created and this class is created only to be enxtended by other class
	public void eat(){}
	final int temp = 1;
	public abstract void walk(); // abstract method declaration

	public final void sleep(){}
//	temp = 10; // error
	// cannot change a final keyword declared variable
	// similar to constant in cpp
	// name final variables in all capital letters
}

class man extends human{
	public void eat(){}
	// any other method other that abstract method are free to be overiden or not

	public void walk(){}
	// not overriding an abstract method from abstract class gives compile time error 
	// derived class also has to be an abstract class incase abstract method is not overiden
	
//	public void sleep(){}
//	sleep is a declared final in human abstract class, so it cannot be overiden in any other inherited class
//	similarly final declared classes also cannot be inherited
}

// interface

interface inf{
	void talk(); // every class that implements this interface must overide all the methods in it.
	// all interface methods are by default abstract
	// Interfaces cannot have objects
	//
	// using interfaces we can achive multiple inheritance in java
	// since we cannot define a function there is not ambiguity in fucntion overriding when inheritance happened
}

class women extends human implements inf{
	public void talk(){} // overriding abstract method of inf interface

	public void walk(){} // overriding abstract method of human class
	
	// interfaces can be usefull
	// we can give interface as reference to any derived class to implement the abstract fucntion with any derived class
	// since derived class objects can be defined to parent class reference
}

// In classes when variables are declared private(we cannot access the variables directly)
// we use getters(to get values) and setters(to set values).
//
//
// In java multiple inheritance is not allowed directly
// When we inherit from two parent classes and both the classes have some funcion
// as same, then the derived class don't know which function to inherit
// This leads to ambiguity, so java has no multiple inheritance directly
// However it can be applied indirectly
