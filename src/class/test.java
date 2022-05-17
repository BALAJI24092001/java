public class test{
	public static void main(String[] args) {
		testing obj = new testing();
		obj.printing();
	}
}

class testing{
	static int a = 5;
	int b = 6;
	void print(){
		System.out.println("in print function");
	}
	void printing(){
		System.out.println("In printing function");
		System.out.println();
		print();
	}
}
