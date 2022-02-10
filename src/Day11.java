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
			System.out.println();
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
			System.out.println();
			try{ Thread.sleep(100); } catch(Exception e){}
		}
	}
}
public class Day11{
	public static void main(String[] args) throws Exception{
		// using thread class
		t1Class t1Obj = new t1Class();
		t2Class t2Obj = new t2Class();

		t1Obj.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2Obj.start();

		t1Obj.join();
		t2Obj.join();


System.out.println("----------------------------------------------------");


		// using Runnable interface
		Runnable t1RunObj = new t1RunClass(); // either t1RunClass or Thread class reference can be used to declasre the variable
		Runnable t2RunObj = new t2RunClass();

		Thread t1RunTrd = new Thread(t1RunObj);
		Thread t2RunTrd = new Thread(t2RunObj);

		t1RunTrd.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2RunTrd.start();

		t1RunTrd.join();
		t2RunTrd.join();

System.out.println("----------------------------------------------------");

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
					System.out.println();
					try{ Thread.sleep(100); } catch(Exception e){}
				}
		};

		Thread t1LE = new Thread(t1RunObj1);
		Thread t2LE = new Thread(t2RunObj1);

		// thread priority
		System.out.println("Name of thread t1LE before : " + t1LE.getName());
		t1LE.setName("t1LE thread");
		System.out.println("Name of thread t1LE after : " + t1LE.getName());

		System.out.println("Name of thread t2LE before : " + t2LE.getName());
		t2LE.setName("t2LE thread");
		System.out.println("Name of thread t2LE after : " + t2LE.getName());


		System.out.println("t1LE priority : " + t1LE.getPriority()); // default priority is 5
		System.out.println("t2LE priority : " + t2LE.getPriority()); // priority ranges between 1 to 10, 1 being the least

		t1LE.setPriority(1);
//		t1LE.setPriority(Thread.MIN_PRIORITY);
		t2LE.setPriority(10);
//		t2LE.setPriority(Thread.MAX_PRIORITY);
		// MIN_PRIORITY = 1
		// MAX_PRIORITY = 10
		// NORM_PRIORITY = 5
		//
		// To refer to a current thread we can use
		// Thread.currentThread() function. Works just like 'this' keyword

		t1LE.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2LE.start();


		// join and alive method
		
		try{t1LE.join();} catch(Exception e){} // join is used to loop the thread with another thread and make sure noting else is running parallelly
		try{t2LE.join();} catch(Exception e){}

		System.out.println(t1LE.isAlive()); // use to find if the thread is alive or not
		// before join statement it is true
		// after join statement, false.



System.out.println("----------------------------------------------------");


//		synchronized keyword
		class Counter{
			int count;
			public 	synchronized void incr(){ // using synchronized keyword
				// makes both the threads not to use the same funcion at the same time
				// whcih can prevent dirty read problem(which leads to data loss)
				this.count++;
			}
		}

		Counter c = new Counter();

		Runnable ct1 = () -> { // creating runnable interface object using lambda expression
				for (int i = 0; i < 1000; i++) {
					c.incr();
			}
		};
		Runnable ct2 = () -> {
				for (int i = 0; i < 1000; i++) {
					c.incr();
			}
		};

		Thread ct1Thr = new Thread(ct1);
		Thread ct2Thr = new Thread(ct2);

		ct1Thr.start();
		ct2Thr.start();

		ct1Thr.join();
		ct2Thr.join();

		System.out.println("Count in Counter class: " + c.count);


	}
}
