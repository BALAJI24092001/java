import java.lang.Exception;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.lang.Thread;
public class cla10{
	public static void main(String[] args) {
		exe Obj = new exe();
		exe Obj1 = new exe(2);
		exe obj2 = new exe(2, 3);
		int age = 20;
		// if(age < 25) throw new ArithmeticException("No... voting cannot be done...");
		

		// Throwing custom exception
		try {
			if(age >= 20) throw new exe();
		}
		catch(Exception e) { // can use exc instead of Exception
			System.out.println("User defined exception...");
		}
		System.out.println("rest of the code...");

		// File writing using FileWriter
		try{
			FileWriter obj= new FileWriter("./text.txt");
			obj.write("Hey this is my first file!!\n");
			obj.write("This is second line. \n");
			obj.append("Hello ");
			System.out.println("Wrote into the file...");
			obj.close();

		}
		catch(IOException e){
			System.out.println("There is a IO issue exception..");
		}

		// File reading using FileReader
		int ch = 0;
		try{
			FileReader obj = new FileReader("./text.txt");
			while((ch= obj.read())!= -1){
				System.out.print((char)ch);
			}
			System.out.println((char)(-1));
			obj.close();
		}
		catch(IOException e){
			System.out.println("Something went wrong IOException...");
		}

		// File manipulation using File class
		try{
			File obj = new File("./text.txt");
			Scanner inp = new Scanner(obj); // reading using Scanner object
			while(inp.hasNextLine()){
				String data = inp.nextLine();
				System.out.println(data);
			}

			inp.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found exception...");
		}

		// Thread implementation using Thread class
		th0 thread1 = new th0();
		th1 thread2 = new th1();
		th2 thread3 = new th2();
		thread1.start();
		thread2.start();
		thread3.start();


		// Thread implementation using Runnable interface
		thre1 trd1 = new thre1();
		thre2 trd2 = new thre2();
		thre3 trd3 = new thre3();
		Thread thrd1 = new Thread(trd1);
		Thread thrd2 = new Thread(trd2);
		Thread thrd3 = new Thread(trd3);

	}
}
class exe extends Exception{

	int a;
	int b;
	exe(){

	}
	exe(int a){
		this.a = a;
	}
	exe(int a, int b){
		this.a = a;
		this.b = b;
	}
}


// Types of Multi-tasking:
// -----------------------
// process based multi-tasking are called heavy weight processes
// thread based multi tasking are called light weight processes
// Threads are stored at a single memory location which makes it easy to establish connection
// between threads easily so it makes Thread based multi tasking a light weight MT.
//
// Process based MT stores each process at different memory location which makes
// it hard to communicate between the processes.
//
//
// Thread process excecution:
// -------------------------
// The thread is first in New born state then using the start() funciton it goes 
// into the runnable state, then once we have the process it goes to the running state.
//
// If we are in running state and use the yield state it goes to the runnable state.
//
// It will go to the blocked state if we can give suspend, sleep, wait commands.
// Then it can go to the running stage if we give resume or notofy.
//
// At any point the thread may end if we use stop command.
//
// There are two ways of using the threads, by inheriting
// 1. Runnable inerface 
// 2. Thread class.

// Threads implementation 
// 1. Declare class extending thread class.
// 2. Implement run method
// 3. Create thread object and call start()

class th0 extends Thread{
	@Override
	public void run(){
		for(int i =0; i<5; i++){
			System.out.println("Thread 'A' : " + i);
			try{
				sleep(5000);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException in Thread 'A'");
			}
		}
		System.out.println("Thread 'A' is over.");
	}
}

class th1 extends Thread{
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("Thread 'B' : " + i);
			try{
				sleep(5000);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException in Thread 'A'");
			}
		}
		System.out.println("Thread 'B' is over.");
	}
}

class th2 extends Thread{
	public void run(){
		for(int i=0; i<8; i++){
			System.out.println("Thread 'C' : " + i);
			try{
				sleep(5000);
			}
			catch(InterruptedException e){
				System.out.println("InterruptedException in Thread 'A'");
			}
		}
		System.out.println("Thread 'C' is over.");
	}
}


// By implementing the runnable interface
// 1. Implement run()
// 2. Cread thread obj for the this runnable clasds
// 3. Call start

class thre1  implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Interface Thread 'A' : " + i);
		}
	}
}

class thre2  implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Interface Thread 'B' : " + i);
		}
	}
}
class thre3  implements Runnable{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("Interface Thread 'C' : " + i);
		}
	}
}
