public class lab4pro2{
	public static void main(String[] args) {
		lms stu1 = new lms("Balaji", 19384307, "Statistics", "student");
		stu1.checkout();
		stu1.checkout();
		stu1.details();
	}
}

class lms{
	static int libMem = 0;
	long id;
	String name, department, type;
	int booksTaken = 0, booksLimit = 0;

	lms(String name, long id, String department, String type){
		++libMem;
		this.name = name;
		this.id = id;
		this.department = department;
		this.type = type;
		if(type == "student") booksLimit = 5;
		else if(type == "teacher") booksLimit = 8;
	}

	void checkout(){
		if(booksLimit >= booksTaken) ++booksTaken;
	}

	void checkin(){--booksTaken;}

	void details(){
		System.out.println("Name of student is : " + name);
		System.out.println("id                 : " + id);
		System.out.println("Department         : " + department);
		System.out.println("BooksTaken         : " + booksTaken);
		System.out.println("Enrollment type    : " + type);
	}
}
