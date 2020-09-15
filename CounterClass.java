
public class CounterClass implements Runnable {
	public int counter;

	public CounterClass() {
		this.counter = 0;
	}

	@Override
	public void run() {
		while (true) {
			counter += 1;
			System.out.println("The thread " + Thread.currentThread().getName() + " has counter " + this.counter);
		}
	}

	public static void main(String[] args) {

		Thread t0 = new Thread(new CounterClass());
		Thread t1 = new Thread(new CounterClass());
		Thread t2 = new Thread(new CounterClass());
		Thread t3 = new Thread(new CounterClass());
		Thread t4 = new Thread(new CounterClass());

		t0.setDaemon(true);
		t0.setPriority(Thread.MIN_PRIORITY);
		t1.setDaemon(true);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setDaemon(true);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setDaemon(true);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setDaemon(true);
		t4.setPriority(Thread.MAX_PRIORITY);

		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
	}
}
