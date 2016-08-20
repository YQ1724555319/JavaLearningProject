/**
@Yq
多线程-创建多线程-继承Thread
*/
class Thread1 extends Thread { // 要自定义一个线程就要继承Thread类，并且重写run方法
	private String id;
	Thread1(String id) {
		this.id = id;
	}
	public void run() {
		for (int x = 0;x < 10;x++) {
			System.out.println("线程"+id+"----------"+x);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("一"); // 创建一个线程
		Thread1 t2 = new Thread1("二");
		t1.start(); // 启动线程并调用run方法
		t2.start();

		for (int x = 0;x < 10;x++) {
			System.out.println("主线程---"+x);
		}
	}
}
