public class cla7{
	int val =5;
	public static void main(String[] args) {

		int side = 4;
		float radius = 3.14f;
		int bre = 2;
		area a1 = new area(side);
		area a2 = new area(radius);
		area a3 = new area(side, bre);
		cla6 obj = new cla6();
		System.out.println(obj.val);
	}
}

// fucntion overloading is only possible with varying function parameters, no based on return type of the function
// Do area calculation
class area{
	area(int side){
		System.out.println("Area of square is : " + side*side);
	}
	area(float radius){
		System.out.println("Area of circle is : " + 3.14*radius*radius);
	}
	area(int len, int bre){
		System.out.println("Area of rectangle is : " + len*bre);
	}
}
