/**
@Yq
���߳�--��ȡ�̵߳ĵ�ǰ�������ƣ�
�̶߳����Լ���Ĭ�����ƣ���Thread-0��ʼ

static Thread currentThread():��ȡ��ǰ�̶߳���
getNmae():��ȡ�߳�����
�����߳����ƣ�setName���߹��캯����super(name);

ͬ���̶߳���������ջ�ڴ�ռ䲻ͬ��������ı���Ҳ�ǲ�ͬ�ġ�
*/
class Thread1 extends Thread {
	Thread1(String name) {
		super(name); // ���߳����ƽ��г�ʼ��
	}
	public void run() {
		for (int x = 0;x < 10;x++) { // ��ȡ��ǰ�̵߳Ķ������ò���ȡ����̵߳����ƣ�currentThread()�Ǿ�̬�ģ�����ֱ�ӵ���
			System.out.println("�߳�"+Thread.currentThread().getName()+"------"+x);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.start();
		t2.start();

		for (int x = 0;x < 10;x++) {
			System.out.println("���߳�---"+x);
		}
	}
}
