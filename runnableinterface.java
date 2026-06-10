package javaclass;

public class runnableinterface  implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
			Mythread t = new Mythread();
			Thread t1=new Thread(t);
	        t1.start();
	}

}
