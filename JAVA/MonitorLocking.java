//Simple Ping Pong program using locking inside threads.

public class MonitorLocking {

	boolean isPinged = false;
	boolean isPonged = true;

	class NewThread extends Thread {
		boolean logic;

		NewThread(boolean b) {
			logic = b;
		}

		@Override
		public void run() {
			try {
				if (logic == true)
					ping();
				else
					pong();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	void ping() throws InterruptedException {
		synchronized (this) {
			while (true) {
				if (isPinged == true) {
					isPinged = false;
					wait();
				} else {
					System.out.println("Ping");
					isPinged = true;
					isPonged = false;
					notify();
				}
				Thread.sleep(300);
			}
		}
	}

	void pong() throws InterruptedException {
		synchronized (this) {
			while (true) {
				if (isPonged == true) {
					isPonged = false;
					wait();
				} else {
					System.out.println("Pong");
					isPonged = true;
					isPinged = false;
					notify();
				}
				Thread.sleep(300);
			}
		}
	}

	public static void main(String args[]) {
		MonitorLocking monitorLocking = new MonitorLocking();
		NewThread thread1 = monitorLocking.new NewThread(true);
		NewThread thread2 = monitorLocking.new NewThread(false);
		thread2.start(); // start ping thread
		thread1.start(); // start pong thread
	}
}
