package thread;

public class main extends Thread {
	public void run() {
		System.out.println("First thread"+Thread.currentThread().getName());
		System.out.println("second thread"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		main m1=new main();
		main m2=new main();
		m1.setPriority(Thread.MIN_PRIORITY);
		m1.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
		// TODO Auto-generated method stub

	}

}
