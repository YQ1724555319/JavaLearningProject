/**
@Yq
多线程-多生产者，多消费者。
notifyAll(); 唤醒全部线程
在多生产者，多消费者，也就是说，在操作一个共享资源的两个方向中，每个方向又存在多个线程，这时候在判断数据状态的时候。
要用while循环，这样可以避免因为等待后的线程没有判断数据状态的情况下导致数据错乱。
但是同时在使用while循环判断数据状态来切换线程的时候，容易造成所有的线程都处于等待状态，于是常常和notifyAll一起使用。
*/
/**
共享资源
*/
class Resource {
	private String name; //生产的商品名称
	private int id = 1; // 生产的商品编号
	boolean flag = false; // 标记
	public synchronized void pro(String name) { // 生产商品
		while (true) { // 为了解决两个操作中存在多个线程，而执行完的线程唤醒了己方线程造成的数据错乱，每次等待结束都返回判断数据状态是否符合
			while (flag) {
				try {
					wait();
				}
				catch (Exception e) {
				}
			}
			this.name = name+"------"+id++;
			System.out.println(Thread.currentThread().getName()+"生产"+this.name);
			flag = true;
			notifyAll(); // 在用while循环来让线程判断数据状态时，会造成所有线程等待的假死状况，用notifyAll来解决
		}
	}
	public synchronized void out() {
		while (true) {
			while (!flag) {
				try {
					wait();
				}
				catch (Exception e) {
				}
			}
			System.out.println(Thread.currentThread().getName()+"消费---------"+name);
			flag = false;
			notifyAll();
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
		res.pro("+商品+");
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
		res.out();
	}
}
public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resource res = new Resource();
		new Thread(new Producer(res)).start();
		new Thread(new Producer(res)).start();
		new Thread(new Consumer(res)).start();
		new Thread(new Consumer(res)).start();
	}
}
