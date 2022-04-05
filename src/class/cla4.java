import java.util.Scanner;
public class cla4{
	public static void main(String[] args) {
		// Scope of a variable
		{
			byte a = 50;
//			System.out.println(a);
		}
//		System.out.println(a);
		final float PI = 3.14f; // PI is declared as a constant, it cannot be reassigned with another value.
		Scanner inp = new Scanner(System.in);
		float val = inp.nextFloat();
		char s;
		try{
			s = (char)System.in.read(); // To take input of a character from the user
			if(s == 'c'){
				System.out.println(area(val, PI));
			}
			else if(s == 's'){
				System.out.println(area(val, 1));
			}
			else{
				System.out.println("Give an appropriate operation.");
			}
		}catch(Exception e){}
		inp.close();
	}
	static float area(float radius, float PI){
		return PI*radius*radius;
	}
}
