public class lab1pro2{
	public static void main(String[] args) {
		int m = 11;
		int i, c = 0;
		for (i = 1; i < m; i++) {
			if(m%i == 0) c++;
		}
		if(c == 2) System.out.println(m + " is a prime number.");
		else System.out.println(m + " is not a prime number.");
	}
}
