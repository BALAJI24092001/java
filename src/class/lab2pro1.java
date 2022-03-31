public class lab2pro1{
	// problem 1: String operations using command line arguments
	public static void main(String[] args){
		
		String temp = strOp(args[0], args[1], args[2]);
		System.out.println(temp);
	}

	static String strOp(String str1, String str2, String opr){
		if("compare".equals(opr))
			return str1+str2;
		else if("len".equals(opr))
			return "Length of string 1 is : " + str1.length() + "\nLength of string 2 is : " + str2.length();
		else if("lowerCase".equals(opr))
			return "Lower case of string 1 is : " + str1.toLowerCase() + "\nLower case of string 2 is : " + str2.toUpperCase();
		else if("upperCase".equals(opr))
			return "Upper case of string 1 is : " + str1.toUpperCase() + "\nUpper case of string 2 is : " + str2.toUpperCase();
		else if("compare".equals(opr))
			return (str1 == str2)? "Same": "Not same";
		else
			return "Give an appropriate string operation";
	}
}
