public class lab5pro2{
	public static void main(String[] args) {
		Surgeon s1 = new Surgeon("Balaji", "ENT", 9);
		s1.putData();
	}
}

class Doctor{
	String name, specialization;
	int salary, experience;
	Doctor(String name, String specialization, int experience){
		this.name = name;
		this.specialization = specialization;		
		this.experience = experience;
		salary();
	}
	void putData(){
		System.out.println("Doctor : " + name);
		System.out.println("Specializations : " + specialization);
		System.out.println("Salary : " + salary);
		System.out.println("Surgeries : " + experience);
	}
	void salary(){
		if(experience > 5) salary = 50000;
		else if(experience >= 20) salary = 90000;
	}
}
class Surgeon extends Doctor{
	Surgeon(String name, String specialization, int experience){
		super(name, specialization, experience);
	}
	@Override
	void salary(){
		super.salary();
		salary += 30000;
	}
}
