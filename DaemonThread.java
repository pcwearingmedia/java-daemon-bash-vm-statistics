

public class DaemonThread extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Daemon thread..");
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} finally {
			System.out.println("Daemon thread exiting.");
		}
	}


	public static void main(String [] args) {
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.start();
	}

}
