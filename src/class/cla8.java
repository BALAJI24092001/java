public class cla8{
	public static void main(String[] args) {
		demo obj1 = new demo();
		demo obj2 = new demo();
		obj1.putData();

		obj1.putData();
		obj2.putData();
		System.out.println(area(4));

	}
	static int area(int x){
		return x*x;
	}
}

class demo{
	int value;
	static int count;
	demo(){
		++count;
	}
	demo(int x){
		this();
		this.value = x;
	}
	static{
		count++;
	}
	static void testStatic(){
		count++;
	}
	void putData(){
		System.out.println(count);
	}
	demo copy(demo x){
		this.value = x.value;
		return this;
	}
}

// static variable are called class variables, there is only one vairable for one class
//
// static method calls static method:
// In same class: directly
// in diff class: use class name

// 1. Find the number of objects that has been created for a class using static variable
// use static function also
// 2. Implement library information system using constructors
