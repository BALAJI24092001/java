// Multithreading
//
//
// Using Thread class

class t1Class extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("tlClass");
			try{ Thread.sleep(100); } catch(Exception e){}
		}
	}
}

class t2Class extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("t2Class");
			try{ Thread.sleep(100); } catch(Exception e){}
		}
	}
}

// using runnable interface

class t1RunClass implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("t1RunClass");
			try{ Thread.sleep(100); } catch(Exception e){}
		}
	}
}

class t2RunClass implements Runnable{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("t2RunClass");
			try{ Thread.sleep(100); } catch(Exception e){}
		}
	}
}
public class Day11{
	public static void main(String[] args) {
		// using thread class
		t1Class t1Obj = new t1Class();
		t2Class t2Obj = new t2Class();


		t1Obj.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2Obj.start();



		// using Runnable interface
		Runnable t1RunObj = new t1RunClass(); // either t1RunClass or Thread class reference can be used to declasre the variable
		Runnable t2RunObj = new t2RunClass();

		Thread t1RunTrd = new Thread(t1RunObj);
		Thread t2RunTrd = new Thread(t2RunObj);

		t1RunTrd.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2RunTrd.start();



		// using lambda expression and Runnable interface declaration

		Runnable t1RunObj1 = () -> {
				for (int i = 0; i < 5; i++) {
					System.out.println("t1RunObj1 Lambda expression");
					try{ Thread.sleep(100); } catch(Exception e){}
				}
		};
		Runnable t2RunObj1 = () -> {
				for (int i = 0; i < 5; i++) {
					System.out.println("t2RunObj1 Lambda expression");
					try{ Thread.sleep(100); } catch(Exception e){}
				}
		};

		Thread t1LE = new Thread(t1RunObj1);
		Thread t2LE = new Thread(t2RunObj1);

		t1LE.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2LE.start();



	}
}
