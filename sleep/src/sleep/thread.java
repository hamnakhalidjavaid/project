package sleep;

public class thread extends Thread {
	public void run() {
		char cha;
		for(cha='A';cha <='Z';cha++) {
			System.out.println(cha);
			
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(cha);
	}

	public static void main(String[] args) {
		thread t1=new thread();
		thread t2=new thread();
		thread t3=new thread();
		t1.start();
		t2.start();
		t2.stop();
		// TODO Auto-generated method stub

	}

}
