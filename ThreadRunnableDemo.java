/**
@Yq
���߳�--�����߳�--ʵ��Runnable�ӿ�
���裺
1��������ʵ��Runnable�ӿ�
2������Runnable�ӿ��е�run����
   ���߳�Ҫ���еĴ������ڸ�run�����С�
3��ͨ��Thread�ཨ���̶߳���
4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
    ԭ����Ϊ�Զ����run���������Ķ�����Runnable�������������Ҫ���߳�ȥָ�������run�������ͱ�����ȷ��run��������������
5������Thread���start���������̲߳�����Runnable�ӿ������run������

ʵ�������������Ʊ
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
		Ticket t = new Ticket(); // �����̶߳���
		Thread t1 = new Thread(t); //�½��̣߳�������߳�������Ticket����������
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start(); // �����̲߳�������Ticket��run����
		t2.start();
		t3.start();
		t4.start();
	}
}