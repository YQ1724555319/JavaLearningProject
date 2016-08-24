import java.util.concurrent.locks.*;
/**
*多生产者多消费者，实例的同步，等待，唤醒机制的替代。
在jdk5.0之后，提供了多线程的升级解决方案，对锁机制进行直观的展示。
将同步synchronized替换成实现Lock操作。
将Object类中的wait,notify,notifyAll方法替换成了Condition对象。
该对象可以通过Lock锁进行获取。
*------该示例修改自ProducerConsumerDemo，实现了只唤醒对方线程而不是全部的操作。
*/
/**
共享资源
*/
class Resource {
	private String name;
	private int id = 1;
	private boolean flag = false; //
	private Lock lock = new ReentrantLock(); // 新建锁对象，ReentrantLock实现了Lock
	private Condition pro = lock.newCondition(); //一个新的Condition实例，此实例中有替代wait，notify等的方法。
	private Condition con = lock.newCondition(); //不同的Condition实例
	public void set(String name)throws InterruptedException {
		lock.lock(); // 获取锁，相当于同步，只是把同步的锁显现了出来而不再是隐示
		try {
			while (flag) {
				pro.await(); // 生产者线程等待，相当于Object中的wait方法，同样抛出异常，在方法中抛出
			}
			this.name = name+"------"+id++;
			System.out.println(Thread.currentThread().getName()+"生产"+this.name);
			flag = true;
			con.signal();// 唤醒所属于con实例的消费者等待线程中任意一个
		}
		finally{
			lock.unlock(); // 释放锁，不管是否抛出异常，功能是否停止，都释放锁
		}
	}
	public synchronized void out()throws InterruptedException {
		lock.lock(); // 获取锁
		try {
				while (!flag) {
					con.await(); // 消费者线程等待
				}
				System.out.println(Thread.currentThread().getName()+"消费---------"+name);
				flag = false;
				pro.signal(); // 唤醒生产者线程的任意一个
			}
		finally {
			lock.unlock(); // 释放锁
		}
	}
}
/**
生产者线程
*/
class Producer implements Runnable {
	Resource res;
	Producer(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true) {
			try { // 检测set方法抛出的异常
				res.set("+商品+");
			}
			catch (InterruptedException e) { // 处理set方法抛出的异常
			}
		}
	}
}
/**

*/
class Consumer implements Runnable {
	Resource res;
	Consumer(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true) {
			try {
				res.out();
			}
			catch (InterruptedException e) {
			}
		}
	}
}
public class ProducerConsumerDemo1 {
	public static void main(String[] args) {
		Resource res = new Resource();
		new Thread(new Producer(res)).start();
		new Thread(new Producer(res)).start();
		new Thread(new Consumer(res)).start();
		new Thread(new Consumer(res)).start();
	}
}