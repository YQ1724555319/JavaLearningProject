/**
@Yq
���߳�--ͬ������������this
ͬ��������ͬ��������������ͬ�����ʣ�������ͬ���ԣ�Ҳ���Ƕ���һ��������ôͬ��������û��ָ�������ʱ��ʹ�õ�����һ������
������ͬ��������Ҫ���̶߳�����á���ô��������һ��������������this������ͬ������ʹ�õ�����this��Ҳ�����̻߳���˵run����������������á�

��ô����ͬ��������У�Ҳ���Բ��ô������������󣬶�ֱ����synchronized������this��Ҳ������д
*/
class Ticket implements Runnable {
	private static int ticket = 100;
	public void run() {
		while (true) {
			show();
		}
	}
	public synchronized void show() { // ��һ�����������this��this����ͬ����������
		if (ticket > 0) {
			try {
				Thread.sleep(30); // �Ŵ�ȫ����
			}
			catch(InterruptedException e) {
				e.toString();
			}
			System.out.println(Thread.currentThread().getName()+"----"+ticket--);
			}
		else System.exit(0); // ��������
	}
}

public class ThreadDemo5 {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);  // ����һ���̣߳���������߳����ڶ���t
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

