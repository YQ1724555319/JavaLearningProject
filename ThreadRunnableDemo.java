/**
@Yq
多线程--创建线程--实现Runnable接口
步骤：
1，定义类实现Runnable接口
2，覆盖Runnable接口中的run方法
   将线程要运行的代码存放在该run方法中。
3，通过Thread类建立线程对象
4，将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
    原因：因为自定义的run方法所属的对象是Runnable的子类对象。所以要让线程去指定对象的run方法，就必须明确该run方法的所属对象。
5，调用Thread类的start方法开启线程并调用Runnable接口子类的run方法。

实例：多个窗口卖票
*/
/**

*/
class Ticket implements Runnable {
	private int ticket = 100;
	public void run() {
		while (true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName()+"----"+ticket--);
			}
			else System.exit(0);
		}
	}
}

public class ThreadRunnableDemo {
	public static void main(String[] args) {
		Ticket t = new Ticket(); // 建立线程对象
		Thread t1 = new Thread(t); //新建线程，且这个线程是属于Ticket的所属对象
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start(); // 开启线程并调用所Ticket的run方法
		t2.start();
		t3.start();
		t4.start();
	}
}