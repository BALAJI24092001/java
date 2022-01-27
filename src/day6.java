public class day6{
	public static void main(String[] args) {
		

		/* ARRAYS */


		// one dimensional array
		int[] intarr; // declaring an array
		intarr = new int[3]; // instantiating an array
		int[] intarr1 = new int[]{5, 6, 7, 8}; // declaration of an array using array literals
		// also combining both declaration and instantiating statements
		for (int i = 0; i < 3; i++) {
			intarr[i] = i;
		}
		for (int var : intarr) {
			System.out.println(var);
			// using for each loop to print values from an array
			// There are disadvantages in using for each loop
			// 1. We cannot find the array index of the array value
			// 2. We cannot update the array value
			// 3, Cannot itterate the array from back
			// 4. Have low performance issues
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(intarr[i]);
			// using for loop
		}


		// array of non-primitive data types(objects of class Student)
		Student[] stuArr = new Student[3];
		String[] names = new String[]{"Balaji", "Java", "cpp"};
		int[] rollNo = new int[]{1, 2, 3};
		for (int i = 0; i < names.length; i++) {
			stuArr[i] = new Student(rollNo[i], names[i]);
		}
		for (Student var : stuArr) {
			System.out.println("Name : " + var.name + " RollNo : " + var.roll_no);
		}
		System.out.println();
		for (int var : test()) { // for each loop justifing array returned by test function
			System.out.print(var + "  ");
		}
		System.out.println();
		System.out.println();


		// two dimensional array
		int[][] twoarr = { {1, 2, 3}, {4, 5, 6} };
//		System.out.println(twoarr.length);
		for (int i = 0; i < twoarr.length; i++) {
			for (int j = 0; j < twoarr[0].length; j++) {
				System.out.print(twoarr[i][j] + "  ");
			}
			System.out.println();
		}


		// three dimensional array
		int[][][] threearr = { {{1, 2}, {3, 4}}, { {5, 6}, {6,7} } };
		System.out.println();
		System.out.println();
		for (int[][] var : threearr) {
			for (int i = 0; i < var.length; i++) {
				for (int j = 0; j < var[0].length; j++) {
					System.out.print(var[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

		//sandglass timer pattern
		
	}
	// a fucntion returning an array.
	public static int[] test(){ // test function created outside of the main function but inside of the main class.
		return new int[]{1, 2, 3, 4};
	}
}


class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
