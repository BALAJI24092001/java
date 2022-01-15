
class Calc{

	int n1;
	int n2;
	int res;
	

	public void add(){
		System.out.println(n1 + n2);
	}
	public void add(int i){ // method overloading
		System.out.println(i + n2);
	}
	public void add(int i, int j){
		System.out.println(i + j);
	}
	public Calc(){ 
		// A constructor has same name as the class
		// A constructor does not return any value
		// A constructor is automatically called when an object is created, and only once it is called through out the object's life  }
		n1 = 5;
		n2 = 5;
		res = 5;
	}
	public Calc(int n1){ // Constructor overloading
		this.n1 = n1;  // this pointer, same as this pointer in cpp
		n2 = 5;
		res = this.n1 + n2;
	}
	public Calc(int n1, double n2){
		this.n1 = n1;
		this.n2 = (int)n2;
		res = 5;
	}
	public Calc(int n1, double n2, char res){
		this.n1 = n1;
		this.n2 = (int)n2;
		this.res = (int)res;
	}

}

public class day4{
	public static void main(String[] args) {
		
	}
}


