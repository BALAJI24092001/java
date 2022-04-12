import java.util.Scanner;
public class cla6{
	public static void main(String[] args) {
		int arr[][] = {
			{1, 2},
			{3, 4}
		};

		// continue and break statements
		System.out.println("Continue and break statements: ");
		for (int i = 0; i < 8; i++) {
			if(i==1) continue;
			else if(i == 4) break;
			System.out.print(i + " ");
			
		}
		System.out.println();

		// labled loops
		System.out.println("labled loops: ");
		z: for (int i = 0; i < 5; i++) for(int j = 0; j < 5; j++){
			if(i == 4) break z;
			else if(j == 4) System.out.println();
			else System.out.print(j + " ");
		}	
	System.out.println();
	System.out.println();
	clas obj = new clas();
	obj.getData();
	obj.putData();
	obj.getData();
	}
}

// user difined data class testing
class clas{
	String str = "Balaji";
	long num = 9441051303l;
	private float PI = 3.14f;

	// default constructor
	clas(){

	}

	// parameterised constructor
	clas(long num){
		this.num = num;
	}

	// construntor overloading with multiple parameters
	clas(int num, String str){
		this.str = str;
		this.num = num;
	}

	// copy construntor
	clas(clas obj){
		this.num = obj.num;
		this.str = obj.str;
	}

	// input data from user
	void putData(){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter you name: ");
		this.str = inp.nextLine();
		System.out.print("Enter your mobile number: ");
		this.num = inp.nextLong();
		inp.close();
	}

	// print output to the console
	void getData(){
		System.out.println(str + ": " + num);
	}
}
