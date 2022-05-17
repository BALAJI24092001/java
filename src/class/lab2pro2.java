public class lab2pro2{
	// 2. Sorting an array, using command line arguments
	public static void main(String[] args) {
		// sort array, arguments from command line
		int[] array = new int[args.length];
		for(int i = 0; i< args.length; i++)
			array[i] = Integer.parseInt(args[i]);
		int[] sortedArray = bubbleSort(array);
		for(int i: sortedArray){
			System.out.print(i + ", ");
		}
		System.out.println();
		
	}
	
	// 2. Array sorting using command line arguments
	static int[] bubbleSort(int arr[]){
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		    for (int j = 0; j < n-i-1; j++)
			if (arr[j] > arr[j+1])
			{
			    int temp = arr[j];
			    arr[j] = arr[j+1];
			    arr[j+1] = temp;
			}
		return arr;
    	}
}
