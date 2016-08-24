import java.util.concurrent.locks.*;
/**
*�������߶������ߣ�ʵ����ͬ�����ȴ������ѻ��Ƶ������
��jdk5.0֮���ṩ�˶��̵߳���������������������ƽ���ֱ�۵�չʾ��
��ͬ��synchronized�滻��ʵ��Lock������
��Object���е�wait,notify,notifyAll�����滻����Condition����
�ö������ͨ��Lock�����л�ȡ��
*------��ʾ���޸���ProducerConsumerDemo��ʵ����ֻ���ѶԷ��̶߳�����ȫ���Ĳ�����
*/
/**
������Դ
*/
class Resource {
	private String name;
	private int id = 1;
	private boolean flag = false; //
	private Lock lock = new ReentrantLock(); // �½�������ReentrantLockʵ����Lock
	private Condition pro = lock.newCondition(); //һ���µ�Conditionʵ������ʵ���������wait��notify�ȵķ�����
	private Condition con = lock.newCondition(); //��ͬ��Conditionʵ��
	public void set(String name)throws InterruptedException {
		lock.lock(); // ��ȡ�����൱��ͬ����ֻ�ǰ�ͬ�����������˳�������������ʾ
		try {
			while (flag) {
				pro.await(); // �������̵߳ȴ����൱��Object�е�wait������ͬ���׳��쳣���ڷ������׳�
			}
			this.name = name+"------"+id++;
			System.out.println(Thread.currentThread().getName()+"����"+this.name);
			flag = true;
			con.signal();// ����������conʵ���������ߵȴ��߳�������һ��
		}
		finally{
			lock.unlock(); // �ͷ����������Ƿ��׳��쳣�������Ƿ�ֹͣ�����ͷ���
		}
	}
	public synchronized void out()throws InterruptedException {
		lock.lock(); // ��ȡ��
		try {
				while (!flag) {
					con.await(); // �������̵߳ȴ�
				}
				System.out.println(Thread.currentThread().getName()+"����---------"+name);
				flag = false;
				pro.signal(); // �����������̵߳�����һ��
			}
		finally {
			lock.unlock(); // �ͷ���
		}
	}
}
/**
�������߳�
*/
class Producer implements Runnable {
	Resource res;
	Producer(Resource res) {
		this.res = res;
	}
	public void run() {
		while (true) {
			try { // ���set�����׳����쳣
				res.set("+��Ʒ+");
			}
			catch (InterruptedException e) { // ����set�����׳����쳣
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