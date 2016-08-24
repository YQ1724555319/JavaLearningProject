/**
���߳�-����
ͬ����Ƕ��ͬ��
*/
class Test implements Runnable {
	private boolean par;
	Test(boolean par) {
		this.par = par;
	}

	public void run() {
		if (par) {
			synchronized(Deadlock.o1) {
				System.out.println("if lockA");
				synchronized(Deadlock.o2) {  // ��ͬ����Ƕ����ͬ��
					System.out.println("if lockB");
				}
			}
		}
		else {
			synchronized(Deadlock.o2) {
				System.out.println("else lockA");
				synchronized(Deadlock.o1) {
					System.out.println("else lockB");
				}
			}
		}
	}
}

class Deadlock {
	static Object o1 = new Object();
	static Object o2 = new Object();
}
public class ThreadDeadLockDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t2.start();
	}
}
