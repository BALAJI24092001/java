public class lab5pro1{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 4);
		Circle cir = new Circle(2);
		rec.printDimensions();
		rec.area();
		cir.printDimensions();
		cir.area();
	}
}
class Shape{
	int measure1;
	Shape(int a){
		measure1 = a;
	}
	void printDimensions(){
		System.out.println("Shape class: measure1 is " + measure1);
	}
}
class Rectangle extends Shape{
	int measure2;
	Rectangle(int a, int b){
		super(a);
		measure2 = b;
	}
	@Override
	void printDimensions(){
		System.out.println("Rectangle class: measure1 is " + measure1);
		System.out.println("Rectanble class: measure2 is " + measure2);
	}
	void area(){
		System.out.println("Area of rectangle : " + measure1*measure2);
	}
}
class Circle extends Shape{
	Circle(int a){
		super(a);
	}
	@Override
	void printDimensions(){
		System.out.println("Circle class: measure1 is " + measure1);
	}
	void area(){
		float temp = measure1;
		System.out.println("Area of circle : " + 3.14*temp*temp);
	}
}
