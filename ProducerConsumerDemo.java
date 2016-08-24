/**
@Yq
���߳�-�������ߣ��������ߡ�
notifyAll(); ����ȫ���߳�
�ڶ������ߣ��������ߣ�Ҳ����˵���ڲ���һ��������Դ�����������У�ÿ�������ִ��ڶ���̣߳���ʱ�����ж�����״̬��ʱ��
Ҫ��whileѭ�����������Ա�����Ϊ�ȴ�����߳�û���ж�����״̬������µ������ݴ��ҡ�
����ͬʱ��ʹ��whileѭ���ж�����״̬���л��̵߳�ʱ������������е��̶߳����ڵȴ�״̬�����ǳ�����notifyAllһ��ʹ�á�
*/
/**
������Դ
*/
class Resource {
	private String name; //��������Ʒ����
	private int id = 1; // ��������Ʒ���
	boolean flag = false; // ���
	public synchronized void pro(String name) { // ������Ʒ
		while (true) { // Ϊ�˽�����������д��ڶ���̣߳���ִ������̻߳����˼����߳���ɵ����ݴ��ң�ÿ�εȴ������������ж�����״̬�Ƿ����
			while (flag) {
				try {
					wait();
				}
				catch (Exception e) {
				}
			}
			this.name = name+"------"+id++;
			System.out.println(Thread.currentThread().getName()+"����"+this.name);
			flag = true;
			notifyAll(); // ����whileѭ�������߳��ж�����״̬ʱ������������̵߳ȴ��ļ���״������notifyAll�����
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
			System.out.println(Thread.currentThread().getName()+"����---------"+name);
			flag = false;
			notifyAll();
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
		res.pro("+��Ʒ+");
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
