/**
@Yq
���߳�-�������߳�-�̳�Thread
*/
class Thread1 extends Thread { // Ҫ�Զ���һ���߳̾�Ҫ�̳�Thread�࣬������дrun����
	private String id;
	Thread1(String id) {
		this.id = id;
	}
	public void run() {
		for (int x = 0;x < 10;x++) {
			System.out.println("�߳�"+id+"----------"+x);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("һ"); // ����һ���߳�
		Thread1 t2 = new Thread1("��");
		t1.start(); // �����̲߳�����run����
		t2.start();

		for (int x = 0;x < 10;x++) {
			System.out.println("���߳�---"+x);
		}
	}
}
