public class lab3pro2{
	public static void main(String[] args){
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {1, 2, 3, 4, 5};
//		System.out.println(arrayCompare(array1, array2));
		
		
		int c = Integer.parseInt(args[0]);
		switch (c) {
			case 1:
				System.out.println("Result of array comparision is: " + arrayCompare(array1, array2));
				break;
			case 2:
				arraysRemoveCommonElements(array1, array2);
				break;
			case 3:
				greatestArrayElement(array1, array2);
				break;
			case 4:
				arraySwapSameArraySize(array1, array2);
		}

		
	}

	// comparing 2 arrays if they are equal
	static boolean arrayCompare(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length) return false;
		for (int i = 0; i < arr1.length; i++) if(arr1[i] != arr2[i]) return false;
		return true;
	}
	
	// removing common elements from 2 arrays
	static void arraysRemoveCommonElements(int[] arr1, int[] arr2){
		System.out.print("Array one elements after removing common elements : ");
		for(int i=0; i<arr1.length; i++) for(int j=0; j<arr2.length; j++){
			if(arr1[i] == arr2[j]){
				i++;
				break;
			} else if(j == arr2.length-1) System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.print("Array two elements after removing common elements : ");
		for(int i=0; i<arr2.length; i++) for(int j=0; j<arr1.length; j++){
			if(arr2[i] == arr1[j]){
				i++;
				break;
			} else if(j == arr1.length-1) System.out.print(arr2[i]);
		}
		System.out.println();
	}

	// greatest element among the two arrays
	static int greatestArrayElement(int[] array1, int[] array2){
		int temp = 0;
		for(int i: array1) if( temp < i ) temp = i;
		for(int i: array2) if( temp < i ) temp = i;
		return temp;
	}

	// array swap if arr1.length == arr2.length
	static void arraySwapSameArraySize(int[] arr1, int[] arr2){
		int size = arr1.length;
		for(int i = 0; i<size; i++){
			int temp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
		System.out.print("Array 1 : ");
		printArray(arr1);
		System.out.print("Array 2 : ");
		printArray(arr2);
	}

	// printing arrays
	static void printArray(int[] array){
		for(int i: array) System.out.print(i + ", ");
		System.out.println();
	}
}
